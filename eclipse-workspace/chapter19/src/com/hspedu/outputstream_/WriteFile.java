package com.hspedu.outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class WriteFile {
	public static void main(String[] args) {
		
	}
	/**
	 * 演示使用FileOutputStream将数据写到文件中
	 * 如果该文件不存在，则创建该文件
	 */
	@Test
	public void writeFile() {
		//创建FileOutputStream对象
		String filePath = "d:\\a.txt";
		FileOutputStream fileOutputStream = null;
		
		try {
			//得到FileOutputStream对象
			//1.new FileOutputStream(filePath)创建方式，当写入内容时，会覆盖原来的内容
			//2.new FileOutputStream(filePath,true)创建方式，当写入内容是，是追加到文件后面
			//fileOutputStream = new FileOutputStream(filePath);
			fileOutputStream = new FileOutputStream(filePath,true);
			
			//1.写入一个字节
			//fileOutputStream.write('H');//char->int
			//2.写入字符串
			String str = "hsp,word";
			//str.getBytes()字符串 转换成 字节数组
			//fileOutputStream.write(str.getBytes());
			/*
			 * write(byte[] b,int offset,int len);
			 * 将len字节从未与偏移量 off的指定字节数量
			 */
			//fileOutputStream.write(str.getBytes(),0,str.length());
			fileOutputStream.write(str.getBytes(),0,3);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
					e.printStackTrace();
			}
		}
	}
}
