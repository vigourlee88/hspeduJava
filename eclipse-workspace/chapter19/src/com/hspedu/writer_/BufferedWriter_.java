package com.hspedu.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//演示BufferedWriter的使用
public class BufferedWriter_ {
	public static void main(String[] args) throws IOException {
		String filePath = "d:\\ok.txt";
		//创建BufferedWriter对象
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
		//1.new FileWriter(filePath,true)表示以 追加 的方式写入
		//2.new FileWriter(filePath)表示以 覆盖 的方式写入
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));//追加
		bufferedWriter.write("hello,韩顺平教育!");
		bufferedWriter.newLine();//插入一个和系统相关的换行
		bufferedWriter.write("hello2,韩顺平教育!");
		bufferedWriter.newLine();
		bufferedWriter.write("hello3,韩顺平教育!");
		bufferedWriter.newLine();
		
		
		//说明:关闭外层流即可，传入的new FileWriter(filePath),会在底层关闭
		bufferedWriter.close();
		
	}
}
