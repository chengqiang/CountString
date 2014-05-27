package day01;

public class SingleTon {
	private static SingleTon singleton=null;
	
	private SingleTon(){
		System.out.println("执行构造函数");
	}
	public static SingleTon getInstance(){
		if(singleton==null){
			singleton=new SingleTon();
		}
		return singleton;
	}
}
