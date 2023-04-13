package com.hspedu.outputstream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//演示ObjectOutputStream的使用，完成数据的序列化
public class ObjectOutputStream_ {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//序列化后，保存的文件格式，不是存文本，而是按照它的格式来保存
		String filePath = "d:\\data.txt ";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
		
		//序列化数据到d:\\data.txt
		oos.writeInt(100);//int -> Integer(实现了Serializable接口)
		oos.writeBoolean(true);//boolean -> Boolean(实现了Serializable接口)
		oos.writeChar('a');//char -> Character(实现了Serializable接口)
		oos.writeDouble(9.5);//double->Double(实现了Serializable接口)
		oos.writeUTF("韩顺平教育");//String(实现了Serializable接口)
		//保存一个dog对象
		oos.writeObject(new Dog("旺财",10,"日本","白"));
		
		oos.close();
		System.out.println("数据保存完毕(序列化形式)");
		
	}
}