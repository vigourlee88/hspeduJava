package com.hspedu.map_;

import java.util.Properties;

public class Properties_ {
	
	public static void main(String[] args) {
		//1.Properties继承了Hashtable类，
		//2.通过k-v存放数据，key和value不能为null
		Properties properties = new Properties();
		
		properties.put("john",100);
//		properties.put(null,100);//抛出 空指针异常
//		properties.put("john",null);//抛出 空指针异常
		properties.put("lucy",100);
		properties.put("lic",100);
		properties.put("lic",88);//如果有相同的key,value的值被替换
		System.out.println("properties="+ properties);
		
		//删除
		properties.remove("lic");
		System.out.println("properties="+ properties);
		//改
		properties.put("john","北京大学");
		System.out.println("properties="+ properties);
		//通过k 获取对应的值
		System.out.println(properties.get("lucy"));
		//查
        System.out.println(properties.getProperty("john"));
	}
}
