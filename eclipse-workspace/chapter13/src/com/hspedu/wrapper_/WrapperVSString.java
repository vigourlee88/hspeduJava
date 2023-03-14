package com.hspedu.wrapper_;

public class WrapperVSString {
	public static void main(String[] args) {
		
		//包装类型 ——————————>String类型
		Integer i = 10;
		//方式1:
		String s1 = i.toString(i);
		//方式2:
		String s2 = String.valueOf(i);
		//方式3:
		String s3 = i + "";//"i"
		System.out.println(s3);
		
		//String类型 ——————————>包装类
		String s4 = "12345";
		//方式1:
		Integer i2 = Integer.parseInt(s4);//使用自动装箱
		//方式2:
		Integer i3 = new Integer(s4);//构造器
		
	}
}
