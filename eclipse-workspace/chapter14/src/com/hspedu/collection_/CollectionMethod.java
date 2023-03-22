package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
	@SuppressWarnings("all")
	public static void main(String[] args) {

	List list = new ArrayList();
	//add 添加单个元素
	list.add("jack");
	list.add(10);//本质 list.add(new Integer(10));
	list.add(true);
	System.out.println("list=" + list);//已经是对象了
	//remove 删除指定元素
	//list.remove(0);//删除第一个元素
	list.remove("jack");//指定删除某个元素
	System.out.println("list=" + list);
	//contains 查找元素是否存在
	System.out.println(list.contains("jack"));
	//size 获取元素的个数
	System.out.println(list.size());
	//isEmpty 判断是否为空
	System.out.println(list.isEmpty());
	//clear 清空
	list.clear();
	System.out.println("list=" + list);
	//addAll添加多个元素
	ArrayList list2 = new ArrayList();
	list2.add("红楼梦");
	list2.add("三国演义");
	list.addAll(list2);
	System.out.println("list=" + list);
	//containsAll查找多个元素是否存在
	System.out.println(list.containsAll(list2));
	//removeAll 删除多个元素
	list.add("聊斋");
	list.removeAll(list2);
	System.out.println("list=" + list);
	//说明 以ArrayList实现类来演示
	}
}
