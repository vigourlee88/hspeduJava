package com.hspedu.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//演示BufferedReader 使用
public class BufferedReader_ {
	public static void main(String[] args) throws IOException {
		
		String filePath= "d:\\a.java";
		//创建bufferedReader
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		//读取
		String line;//按行读取,效率高
		//说明
		//从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取
		//1.bufferedReader.readLine()按行读取文件
		//2.当返回null时，表示文件读取完毕
		//3.
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		//关闭流，这里注意，只需要关闭处理流 BufferedReader，
		//因为底层会自动的去关闭 节点流FileReader
		//FileReader
		/* 
		public void close() throws IOException {
		     synchronized(lock){
		        if (in == null)
		            return;
		        try {
		            in.close();//in就是传入的new FileReader(filePath),关闭了
		        } finally {
		            in = null;
		            cb = null;
		        }
		    }
		  }
		 */
		bufferedReader.close();
		
	}
}
