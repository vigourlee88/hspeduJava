package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class MapMethod {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("邓超", new Book("",100));//ok
		map.put("邓超", "孙俪");//替换=>
		map.put("王宝强", "马蓉");//ok
		map.put("宋晶", "马蓉");//ok
		map.put("刘令博",null);//ok
		map.put(null,"刘亦菲");//ok
		map.put("鹿晗","关晓彤");
		
		System.out.println("map=" + map);
		
		//remove:根据键删除映射关系
		map.remove(null);
		System.out.println("map=" + map);
		
		//get:根据键获取值
		Object val = map.get("鹿晗");
		System.out.println("val=" + val);
		//size:获取元素个数
		System.out.println("k-v=" + map.size());
		//isEmpty:判断个数是否为0
		System.out.println(map.isEmpty());//F
		//clear:清除
		//map.clear();
		System.out.println("map=" + map);
		//containsKey:会找键是否存在
		System.out.println(map.containsKey("hsp"));//F
	}
}
class Book{
	private String name;
	private int num;
	public Book(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
}