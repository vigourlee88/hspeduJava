package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		//1.集合主要有2组 单列集合和双列集合
		//2.Collection接口有2个子接口List 和Set,他们的实现类都是单列集合
		//3.Map接口的实现类是双列集合，存在的K-V
		ArrayList arrayList = new ArrayList();
		arrayList.add("jack");
		arrayList.add("tom");
		
		HashMap hashMap = new HashMap();
		hashMap.put("No1", "北京");
		hashMap.put("No2", "上海");
	}
}
