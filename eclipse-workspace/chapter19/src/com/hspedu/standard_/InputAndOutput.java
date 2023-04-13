package com.hspedu.standard_;

import java.util.Scanner;

public class InputAndOutput {
	public static void main(String[] args) {
		//1.System 类的public final static InputStream in = null;
		//2.System.in 编译类型 InputStream
		//3.System.in 运行类型 BufferedInputStream
		//4.表示标准输入 键盘
		System.out.println(System.in.getClass());
		
		//1.System.out public final static PrintStream out = null;
		//2.编译类型 PrintStream
		//3.运行类型 PrintStream
		//4.表示标准输出 显示器
		System.out.println(System.out.getClass());
		
		System.out.println("hello,安顺平教育");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入内容");
		String next = scanner.next();//就会到 标准的键盘 去读取
		System.out.println("next=" + next);
	}
}
