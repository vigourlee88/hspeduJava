package com.hspedu.inputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


import com.hspedu.outputstream_.Dog;

public class ObjectInputStream_ {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//指定反序列化文件
		String filePath = "d:\\data.txt";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
		
		//读取
		//1.读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
		//2.否则会出现异常
		
		System.out.println(ois.readInt());
		System.out.println(ois.readBoolean());
		System.out.println(ois.readChar());
		System.out.println(ois.readDouble());
		System.out.println(ois.readUTF());
		//dog的编译类型是Object,运行类型是Dog
		Object dog = ois.readObject();
		System.out.println("运行类型=" + dog.getClass());
		System.out.println("dog信息=" + dog);//底层将Object->Dog
		
		//1.如果我们希望调用Dog的方法，需要向下转型
		//2.需要我们将Dog类的定义，放在引用的位置
		//3.dog被保存在这个包下 com.hspedu.outputstream_.Dog;
		Dog dog2 = (Dog)dog;
		System.out.println(dog2.getName());
		
		//关闭流，关闭外层流即可，底层会自动关闭FileInputStream流
		ois.close();
		System.out.println("数据保存完毕(反序列化方式)");
	}
}