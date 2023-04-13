package com.hspedu.homework_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
	public static void main(String[] args) throws IOException {
		/*
		 * 要求: 使用BufferedReader读取一个文本文件，为每行加上行号， 再连同内容一并输出到屏幕上。
		 * 如果把文件的编码 改成了gbk 出现中文乱码
		 * 1.默认是按照utf-8处理，开始没有乱码
		 * 2.提示:使用我们的转换流，
		 * 将FileInputStream ->InputStreamReader(可以指定编码)->BufferReader
		 */
		String filePath = "d:\\a.txt";
		BufferedReader br = null;
		String line = "";
		int lineNum = 0;
		try {
			br = new BufferedReader(new FileReader(filePath));
			while((line = br.readLine()) != null){//循环读取
				System.out.println(++lineNum + line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				br.close();
			}
		}	
	}
}
