package com.hspedu.map_;

import java.util.Hashtable;

@SuppressWarnings("all")
public class HashTableExercise {
	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		table.put("john", 100);
	//	table.put(null, 100);//异常 NullPointerException
	//	table.put("john", null);//异常 NullPointerException
		table.put("lucy", 100);
		table.put("lic", 100);
		table.put("lic", 88);//替换
		table.put("hello1", 1);
		table.put("hello2", 1);
		table.put("hello3", 1);
		table.put("hello4", 1);
		table.put("hello5", 1);
		table.put("hello6", 1);
		System.out.println(table);
		
		//Hashtable的底层
		//1.底层有数组 Hashtable$Entry[] 初始化大小为11
		//2.临界值 threshold 8 = 11*0.75
		//3.扩容 按照自己的扩容机制进行
		//count ->9 table->22  threshold->17=23*0.75
		//4.执行 方法 addEntry(hash,key,value,index);添加k-v,封装到Entry中
		//5.当if(count >= threshold)满足时，就进行扩容
		//6.按照int newCapacity = (oldCapacity << 1) + 1;的大小扩容
	}
}
