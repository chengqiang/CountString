package day01;

public class CountSubStr {
	public int count(String src,String find){
		int num=0;
		int index=-1;
		while((index=src.indexOf(find, index))>-1){
			++ index;
			++ num;
		}
		return num;
	}
}
