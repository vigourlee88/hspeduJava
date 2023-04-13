package com.hspedu.writer_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCopy_ {
	public static void main(String[] args) {
		
		//说明
		//1.BufferedReader和BufferedWriter是按照字符操作
		//2.不要去操作 二进制文件(声音，视频，doc, pdf)，可能造成文件损坏
		
		String srcFilePath= "d:\\a.java";
		String destFilePath= "d:\\a2.java";
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line ;
		
		
		try {
			br = new BufferedReader(new FileReader(srcFilePath));
			bw = new BufferedWriter(new FileWriter(destFilePath));
			
			//读取 写入
			//说明readLine读取一行内容，但是没有换行
			while((line = br.readLine()) != null) {
				//每读取一行就写入
				bw.write(line);
				//插入一个换行
				bw.newLine();
			}
			System.out.println("拷贝完毕");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//关闭流
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
}
