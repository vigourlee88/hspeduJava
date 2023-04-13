package com.hspedu.file;

import java.io.File;

import org.junit.Test;

public class Directory_ {
	public static void main(String[] args) {
		//
	}
	//判断d:\\news1.txt是否存在如果存在就删除，
	@Test
	public void m1() {
		
		String filePath = "d:\\news1.txt";
		File file = new File(filePath);
		if(file.exists()) {
			if(file.delete()) {
				System.out.println(filePath + "删除成功");
			}else {
				System.out.println(filePath + "删除失败");
			}
		}else {
			System.out.println("该文件不存在");
		}
	}
	//判断d:\\demo02是否存在，存在就删除，否则提示不存在
	//在java编程中，目录也被当成文件
	@Test
	public void m2() {
		
		String filePath = "d:\\demo02.txt";
		File file = new File(filePath);
		if(file.exists()) {
			if(file.delete()) {
				System.out.println(filePath + "删除成功");
			}else {
				System.out.println(filePath + "删除失败");
			}
		}else {
			System.out.println("该目录不存在");
		}
	}
	//判断d:\\demo\\a\\b\\c目录是否存在
	//如果存在就提示已经存在，否则就创建
	@Test
	public void m3() {
		
		String directoryPath = "d:\\demo\\a\\b\\c";
		File file = new File(directoryPath);
		if(file.exists()) {
				System.out.println(directoryPath + "该目录存在");	
		}else {
			if(file.mkdirs()) {//创建多级目录  创建一级目录mkdir()
				System.out.println(directoryPath + "创建成功");
			}else {
				System.out.println(directoryPath + "创建失败");
			}
		}
	}
}
