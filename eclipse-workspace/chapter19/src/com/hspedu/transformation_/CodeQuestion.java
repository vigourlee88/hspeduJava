package com.hspedu.transformation_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//看一个中文乱码问题
public class CodeQuestion {
	public static void main(String[] args) throws IOException {
		//读取d:\\a.txt文本文件到程序
		//思路
		//1.创建 字符输入流 BufferedReader(处理流，里面可以放 节点流FileReader)
		//2.使用BufferedReader对象读取 a.txt文件
		//3.默认情况下，读取文件时按照 UTF-8 编码
		String filePath= "d:\\a.txt";
		BufferedReader br  = new BufferedReader(new FileReader(filePath));
		
		String s = br.readLine();
		System.out.println("读取到内容: " + s);
		br.close();
			
		
	}
}
