package com.hspedu.string_;

public class StringMethod01 {
	public static void main(String[] args) {
		//1.equals 区分大小写,比较的是内容是否相同
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		
		//2.equalsIgnoreCase忽略大小写的判断内容是否相等
		String username = "johN";
		if("john".equalsIgnoreCase(username)) {
			System.out.println("Success");
		}else {
			System.out.println("Failture");
		}
		//3.length获取字符的个数，字符串的长度
		System.out.println("韩教育".length());
		//4.indexOf获取字符在字符串对象中第一次出现的索引，
		//索引从0开始，如找不到，则返回-1
		String s1 = "wer@terwe@g";
		int index = s1.indexOf('@');
		int index3 = s1.indexOf("we");
		System.out.println(index);
		System.out.println(index3);//0
		//5.lastIndexOf获取字符在字符串中最后一次出现的索引，
		//索引从0开始，如找不到，则返回-1
		String s2 = "wer@terwe@g@";
		int index2 = s2.lastIndexOf('@');
		System.out.println(index2);
		//6.substring截取指定范围的子串
		String name = "hello,张三";
		//name.substring(6),从索引6开始，截取后面的所有的内容
		System.out.println(name.substring(6));//截取后面的字符
		//name.substring(0,5),从索引0开始，截取到索引5-1的位置
		System.out.println(name.substring(0,5));
		System.out.println(name.substring(2,5));
	
	}
}
