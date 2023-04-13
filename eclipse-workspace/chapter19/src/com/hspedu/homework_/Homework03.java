package com.hspedu.homework_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

import org.junit.Test;

public class Homework03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		/**
         * (1) 要编写一个dog.properties   name=tom age=5 color=red
         * (2) 编写Dog 类(name,age,color)  创建一个dog对象，
         * 读取dog.properties 用相应的内容完成属性初始化, 并输出
         * (3) 将创建的Dog 对象 ，序列化到 文件 d:\\dog.dat 文件
         */
		String filePath = "src\\dog.properties";
		Properties properties = new Properties();
		properties.load(new FileReader(filePath));//加载文件
	  //properties.list(System.out);//输出到控制台
		String name = properties.get("name") + "";//Object-> String
		int age =Integer.parseInt(properties.get("age") + "");//Object-> int
		String color = properties.get("color") + "";//Object-> String
		
		Dog dog = new Dog(name,age,color);
		System.out.println("===dog对象信息===");
		System.out.println(dog);
		
		//将创建的Dog 对象 ,序列化到 文件 d:\\dog.dat 文件
		String serFilePath = "d:\\dog.dat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
		oos.writeObject(dog);
		
		//关闭流
		oos.close();
		System.out.println("dog对象，序列化完成~");
	}
	
	//在编写一个方法，反序列化dog
	@Test
	public void m1() throws FileNotFoundException, IOException, ClassNotFoundException {
		String serFilePath = "d:\\dog.dat";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
		Dog dog = (Dog) ois.readObject();
		
		System.out.println("===反序列化后 dog信息===");
		System.out.println(dog);
		
		ois.close();
	}
}
