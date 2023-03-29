package com.hspedu.homework_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class Homework03 {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("jack", 650);//int =>Integer
		m.put("tom", 1200);//int =>Integer
		m.put("smith", 2900);//int =>Integer
		System.out.println(m);
		
		m.put("jack", 2600);//替换
		System.out.println(m);
		
		//遍历所有员工
		//使用keySet方式
		Set keySet = m.keySet();
		for (Object key : keySet) {
			//更新      m.get(key)是个Object,需要向下转型
			m.put(key, (Integer)m.get(key) + 100);
		}
		System.out.println(m);
		
		//遍历 EntrySet
		System.out.println("======遍历======");
		Set entrySet = m.entrySet();
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			 Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey() + "-"+ entry.getValue());
		}	
		
		//遍历所有工资
		System.out.println("===遍历所有的工资===");
		Collection values = m.values();
		for (Object value : values) {
			System.out.println("工资=" + value);
		}
		
	}
	
	
}
