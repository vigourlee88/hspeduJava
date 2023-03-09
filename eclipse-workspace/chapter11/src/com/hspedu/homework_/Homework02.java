package com.hspedu.homework_;

public class Homework02 {
	public static void main(String[] args) {
		
	}
}
class Frock{
	private static int currentNum = 100000;//静态属性
	
	private int serialNumber;
	
	public Frock() {
		serialNumber = getNextNum();
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public static int getNextNum() {//静态方法
		currentNum += 100;
		return currentNum;
	}
}
class TestFrock {
	public static void main(String[] args) {
		//静态属性 是所有对象共享的
		System.out.println(Frock.getNextNum());//100100
		System.out.println(Frock.getNextNum());//100200
		Frock frock1 = new Frock();
		Frock frock2 = new Frock();
		Frock frock3 = new Frock();
		System.out.println(frock1.getSerialNumber());//100300
		System.out.println(frock2.getSerialNumber());//100400
		System.out.println(frock3.getSerialNumber());//100500
	}	
}