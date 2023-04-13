package com.hspedu.printstream_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//演示PrintWriter使用方式
public class PrintWriter_ {
	public static void main(String[] args) throws IOException {
		
		//PrintWriter printWriter = new PrintWriter(System.out);
		PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\f2.txt"));
		printWriter.print("hi,北京你好");//输出到d:\\f2.txt中，此时显示器没有输出
		
		//无close() 就不会刷新
		printWriter.close();//flush + 关闭流，才会将数据写入到文件..
	}
}
