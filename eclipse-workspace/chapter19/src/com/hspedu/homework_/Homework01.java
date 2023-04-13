package com.hspedu.homework_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
	public static void main(String[] args) throws IOException {
		/* 
         *(1) 在判断d盘下是否有文件夹mytemp ,如果没有就创建mytemp
         *(2) 在d:\\mytemp 目录下, 创建文件 hello.txt
         *(3) 如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         *(4) 并且在hello.txt 文件中，写入 hello,world~
         */
		String directorPath = "d:\\mytemp";
		File file = new File(directorPath);
		if (!file.exists()) {
			// 创建
			if (file.mkdirs()) {//创建目录(文件夹)
				System.out.println("创建" + directorPath + " 创建成功");
			} else {
				System.out.println("创建" + directorPath + " 创建失败");
			}
			String filePath = directorPath + "\\hello.txt";
			file = new File(filePath);
			if (!file.exists()) {
				// 创建文件
				if (file.createNewFile()) {
					System.out.println(filePath + " 创建成功");
					
					//如果文件存在，我们就使用BufferedWriter 字符输入流 写入内容
					BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
					bw.write("hello,world~韩顺平教育");
					bw.close();
					
				} else {
					System.out.println(filePath + " 创建失败");
				}
			}else {
				//如果文件已经存在，给出提示信息
				System.out.println(filePath + "已经存在，不再重复创建");
				
			}
		}
	}
}
