package com.hspedu.transformation_;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 演示OutputStreamWriter 使用
 * 把FileOutputStream 字节流，转成字符流OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
	public static void main(String[] args) throws IOException {
		
		String filePath = "d:\\hsp.txt";
		String charSet = "utf8";//ANSI 国标码gbk
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),charSet);
		//字符流 可以写入内容
		osw.write("hi,韩顺平教育");
		osw.close();
		System.out.println("按照 " + charSet + " 保存文件成功~~");

	}
}
