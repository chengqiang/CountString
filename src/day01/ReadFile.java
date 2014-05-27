package day01;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 * Java上实现统计某一目录下每个文件中出现的字母个数、数字个数、空格
 * 个数以及行数
 * @author Administrator
 *
 */
public class ReadFile {
	//保存文件统计信息
	public static List<file> flist=new ArrayList<file>();
	public static void GetFile(String path){
		File fileDir=new File(path);
		ComputeFile(fileDir);
	}
	private static void ComputeFile(File fileDir) {
		// TODO Auto-generated method stub
		if(fileDir.isDirectory()){//文件目录
			File[] farray=fileDir.listFiles();
			for(File f:farray){
				ComputeFile(f);
			}
		}else{//是文件
			int countChar=0;
			int countNum=0;
			int countRow=0;
			int countBlank=0;
			char ch=0;
			try {
				FileInputStream fis=new FileInputStream(fileDir);
				BufferedReader br=new BufferedReader(new InputStreamReader(fis));
				String line;
				while(( line=br.readLine())!=null){
					countNum++;
					for(int i=0;i<line.length();i++){
						ch=line.charAt(i);
						if(Character.isDigit(ch)){
							countNum++;
						}
						else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
							countChar++;
						}
						else if(ch==' ')//line.substring(i, i+1).equals(" ")
						{
							countBlank++;
						}
					}
				}
				file f=new file();
				f.setCountBlank(countBlank);
				f.setCountChar(countChar);
				f.setCountRow(countRow);
				f.setName(fileDir.getName());
				f.setNum(countNum);
				flist.add(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
