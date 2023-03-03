package com.hspedu.houserent.utils;

public class TestUtility {
	public static void main(String[] args) {
		//这是一个测试类，使用完毕，就可以删除
		//要求输入一个字符串，长度最大为3
//		String s = Utility.readString(10);
//		System.out.println("s=" + s);
		
		//要求输入一个字符串，最大长度为10，
		//如果用户直接回车，就给一个默认值"hspedu"
		System.out.println("请输入一个字符串: ");
		String s2 = Utility.readString(10,"hspedu");
		System.out.println("s2=" + s2);
		
		//这里直接使用 类.方法()=>
		//因为当一个方法static 时，就是一个静态方法
		//静态方法可以直接通过类名调用
		A.cry();//可以直接调用静态方法，正确
	}

}
class A {
	public void hi() {
		
	}
	public static void cry() {
		
	}
}
