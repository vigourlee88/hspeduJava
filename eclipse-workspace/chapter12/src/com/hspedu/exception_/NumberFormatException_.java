package com.hspedu.exception_;

public class NumberFormatException_ {
	public static void main(String[] args) {
		String name ="1234";
		//将String 转换成int
		int num = Integer.parseInt(name);
		System.out.println(num);
		String name2 ="翰教育";
		int num2 = Integer.parseInt(name2);
		System.out.println(num2);//数字格式不正确异常
		
	}
}
