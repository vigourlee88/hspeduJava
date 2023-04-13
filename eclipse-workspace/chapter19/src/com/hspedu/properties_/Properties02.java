package com.hspedu.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//使用Proprties类来读取mysql.properties文件
		
		//1.创建Properties 对象
		Properties properties = new Properties();
		//2.加载指定配置文件
		properties.load(new FileReader("src\\mysql.properties"));
		//3.把k-v显示到控制台
//		properties.list(System.out);
		
		//4.根据key 获取对应的值
		String user = properties.getProperty("user");
		String psw = properties.getProperty("psw");
		System.out.println("用户名=" + user);
		System.out.println("密码="+ psw);
	}
}
