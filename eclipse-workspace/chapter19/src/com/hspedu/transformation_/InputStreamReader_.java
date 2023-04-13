package com.hspedu.transformation_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 演示使用InputStreamReader 转换流 解决中文乱码问题
 * 将字节流InputStream转换成字符流InputStreamReader
 * 指定编码gbk/utf-8
 */
//将字节流FileInputStream包装成字符流InputStreamReader
//文件进行读取(按照utf-8格式)进而在包装成BufferedReader
public class InputStreamReader_ {
	public static void main(String[] args) throws IOException {
		
		String filePath = "d:\\a.txt";
		//1.new FileInputStream 转成InputStreamReader
		//2.指定编码 gbk
//		InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
		//3.把InputStream 传入BuffededReader
//		BufferedReader br = new BufferedReader(isr);
		
		//将2和3合并
		BufferedReader br = new BufferedReader(
			new InputStreamReader(
				new FileInputStream(filePath),"gbk"));
		
		//4.读取
		String s = br.readLine();
		System.out.println("读取内容=" + s);
		//5.关闭外层流
		br.close();
	}
	
}
