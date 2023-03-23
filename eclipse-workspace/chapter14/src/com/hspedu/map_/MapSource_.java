package com.hspedu.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapSource_ {
	public static void main(String[] args) {
		Map map =new HashMap();
		map.put("no1", "韩顺平");
		map.put("no2", "张无忌");
		map.put(new Car(), new Person());
		
		//1.k-v 最后是HashMap$Node node= newNode(hash,key,value,null)
		//2.k-v 为了方便程序员的遍历，还会创建EntrySet集合，该集合存放的元素类型Entry集合,
		//而一个Entry对象就有k，v.EntrySet<Entry<k,V>>
		//即 transient Set<Map.Entry<k,v>> entrySet;
		//3.entrySet中，定义的类型是Map.Entry,但是实际上存放的还是HashMap$Node
		//HashMap$Node static class Node<k,v>实现了Map.Entry<k,V>接口,这个类的对象实例可以赋给一个接口类型，接口的多态
		//4.当把HashMap$Node对象 存放到enrtySet 就方便我们的遍历
		//因为Map.Entry类提供了重要方法
		//K getKey();V getValue();
		//4.
		Set set = map.entrySet();
		System.out.println(set.getClass());//HashMap$EntrySet
		for (Object obj : set) {
			//System.out.println(obj.getClass());//HashMap$Node
			//为了从HashMap$Node取出k-v
			//1.先做一个向下转型
			Map.Entry entry = (Map.Entry) obj;
			System.out.println(entry.getKey() +"-"+ entry.getValue());
		}
		Set set1 = map.keySet();
		System.out.println(set1.getClass());
		Collection values = map.values();
		System.out.println(values.getClass());
	}
}
class Car{
	
}
class Person{
	
}