package com.hspedu.file;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileCreate {
	public static void main(String[] args) {
		
	}

//在e盘下，创建文件news1.txt, news2.txt,news3.txt
//方式1 new File(String pathname)
	@Test
	public void create01() {
		String filePath = "d:\\news1.txt";
		File file = new File(filePath);
		
		try {
			file.createNewFile();
			System.out.print("文件创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//方式2 new File(File parent,String child)
	//根据父目录文件+子路径构建 d:\\news2.txt
	@Test
	public void create02() {
		File parentFile = new File("d:\\");
		String fileName = "news2.txt";
		//这里的file对象，在java程序中，只是一个对象
		//只有执行了createNewFile方法，才会真正的，在磁盘创建该文件
		File file = new File(parentFile,fileName);
		try {
			file.createNewFile();
			System.out.println("创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//方式3 new File(String parent,String child)
	//根据父目录+子路径构建
	@Test
	public void create03() {
		String parentPath = "d:\\";
		String fileName = "news3.txt";
		File file = new File(parentPath,fileName);
		
		try {
			file.createNewFile();
			System.out.println("创建成功");
		} catch (IOException e) {
		 
			e.printStackTrace();
		}
	}
}