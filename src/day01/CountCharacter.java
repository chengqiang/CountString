package day01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java中实现统计某一目录下每个文件中出现的
 * 字母个数、数字个数、空格个数
 * 以及行数
 * 
 * @author Administrator
 *
 */
public class CountCharacter {
	public void count(String str){
		try {
			FileInputStream fi=new FileInputStream(str);
			BufferedReader reader=new BufferedReader(new InputStreamReader(fi));
			int countRow=0;//记录行数
			int countChar=0;//记录字符
			int countNum=0;//记录数字
			int countBlank=0;//记录空格
			String line=reader.readLine();
			while(line!=null){
				countRow++;
				for(int i=0;i<line.length();i++){
					if(Character.isDigit(line.charAt(i))){
						countNum++;
					}
					else if(Character.isJavaLetter(line.charAt(i))){
						countChar++;
					}
					else if(line.substring(i, i+1).equals(" ")){
						countBlank++;
					}
				}
				line=reader.readLine();
			}
			System.out.println("空格出现了："+countBlank+"个");
			System.out.println("字母出现了："+countChar+"个");
			System.out.println("数字出现了："+countNum+"个");
			System.out.println("一共出现了："+countRow+"行");
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("FileNotFoundException异常");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException异常");
		}
	}
}
