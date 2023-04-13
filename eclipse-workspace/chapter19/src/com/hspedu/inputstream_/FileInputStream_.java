package com.hspedu.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

//字节输入流(文件-程序)
public class FileInputStream_ {
	public static void main(String[] args) {
		
	}
	/**
	 * 演示读取文件
	 * 单个字节的读取，效率比较低
	 */
	@Test
	public void readFile01() {
		String filePath = "d:\\hello.txt";
		int readData = 0;
		FileInputStream fileInputStream = null;
		try {
			//创建了FileInputStream对象，用于读取文件
			 fileInputStream = new FileInputStream(filePath);
			//从该输入流读取一个字节的数据，如果没有输入可用的，此方法将阻止。
			//如果返回-1，表示读取完毕
			while((readData = fileInputStream.read()) != -1) {
				System.out.print((char)readData);//转成char显示
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭文件流，释放资源
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	/**
	 * 使用read(byte[] b)读取文件，提高效率
	 */
	@Test
	public void readFile02() {
		String filePath = "d:\\hello.txt";
		//定义字节数组
		byte[] buf = new byte[8];//一次读取8个字节
		int readLen = 0;
		FileInputStream fileInputStream = null;
		try {
			//创建了FileInputStream对象，用于读取文件
			 fileInputStream = new FileInputStream(filePath);
			//从该输入流读取最多b.length字节的数据到字节数组，此方法将阻塞，直到某些输入可
			//如果返回-1，表示读取完毕
			//如果读取正常，返回实际读取的字节数
			while((readLen = fileInputStream.read(buf)) != -1) {
				System.out.print(new String(buf,0,readLen));//转成char显示
				
				/*
				 *  public String(byte[] bytes) {
                 *   this(bytes, 0, bytes.length);
                 *  bytes -要解码为字符的 byte
                 *  offset -要解码的第一个 byte 的索引
                 *  length-要解码的 byte 数 
                 *  }
				 */
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭文件流，释放资源
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
