package com.hspedu.properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
	public static void main(String[] args) throws IOException {
		
		//使用Properties类来创建 配置文件 修改配置文件内容
		Properties properties = new Properties();
		//向Properties中添加键值对信息
		//1.如果该文件没有key,就是创建
		//2.如果该文件有key,就是修改
		/*
		 * Properties父类是Hashtable,底层就是Hashtable核心方法
		 */
		properties.setProperty("charset", "utf8");
		properties.setProperty("user", "汤姆");//注意保存时，是中文的unicode码值
		properties.setProperty("pwd", "abc111");
		
		//将k-v(内存中) 存储文件中
		//store方法的第二个参数是注释，null表示没有注释。
		//在store方法中，如果没有这个文件就是创建，如果有这个文件就是修改。
		properties.store(new FileOutputStream
				("src\\mysql2.properties"),null);
		System.out.println("保存配置文件成功");
	}
}
