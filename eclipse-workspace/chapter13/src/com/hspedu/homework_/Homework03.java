package com.hspedu.homework_;

public class Homework03 {
	public static void main(String[] args) {
		
		String name ="tom";
		printName(name);
	}
	/*
	 * 编写方法 完成输出格式要求的字符串
	 * 编写java程序，输入格式为Han shun Ping 的人名以Ping,Han .S 的形式打印
	 * 思路分析
	 * 1.对输入的字符串进行 分割split(" ")
	 * 2.对得到的数组进行格式化String.format()
	 * 3.对输入的字符串进行校验即可
	 */
	public static void printName(String str) {
		
		if(str == null) {
			System.out.println("str 不能为空");
			return;
		}
		
		String[] names = str.split(" ");
		
		if(names.length != 3) {
			System.out.println("输入的字符串格式不对");
			return;
		}
		
		String format = String.format("%s,%s.%c",names[2],names[0],names[1].toUpperCase().charAt(0));
		System.out.println(format);
	}
}
