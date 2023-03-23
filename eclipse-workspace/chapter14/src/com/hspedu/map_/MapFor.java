package com.hspedu.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("all")
public class MapFor {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("邓超", "孙俪");
		map.put("王宝强", "马蓉");
		map.put("宋杰", "马蓉");
		map.put("刘凌波", null);
		map.put("鹿晗", "关晓彤");
		
		//1.先取出所有的key,再通过key取出对应的value
		Set keyset = map.keySet();
		System.out.println("====第一种方式====");
		Iterator iterator = keyset.iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object value = map.get(key);
			System.out.println(key + "=" + value);	
		}
		
		System.out.println("====第二种方式====");
		for (Object key : keyset) {
			System.out.println(key + "=" + map.get(key));
		}
		
		//2.把所有的values取出
		Collection values = map.values();
		System.out.println("===取出所有的value增强for===");
		//增强for
		for (Object value : values) {
			System.out.println(value);
		}
		//迭代器
		System.out.println("===取出所有的value迭代器===");
		Iterator iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			Object value = iterator2.next();
			System.out.println(value);
		}
		
		//3.通过EntrySet 来获取k-v
		Set entrySet = map.entrySet();//key-value
		System.out.println("===使用EntrySet的增强for===");
		for (Object entry : entrySet) {//EntrySet<Map.Entry<K,V>>
			//将entry 转成Map.Entry
			Map.Entry e = (Entry) entry;
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + "=" + value);
		}
		
		System.out.println("===使用EntrySet的迭代器===");
		Iterator iterator3 = entrySet.iterator();
		while (iterator3.hasNext()) {
			Object entry = iterator3.next();
			//向下转型
			Map.Entry m =(Map.Entry) entry;
			System.out.println(m.getKey() +"-" + m.getValue());
		}
	}
}
