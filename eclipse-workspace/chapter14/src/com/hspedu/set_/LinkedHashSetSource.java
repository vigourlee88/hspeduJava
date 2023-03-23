package com.hspedu.set_;

import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings("all")
public class LinkedHashSetSource {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(new String("AA"));
		set.add(456);
		set.add(456);
		set.add(new Customer("刘",1001));
		set.add(123);
		set.add("HSP");
		System.out.println("set=" + set);
		//1.LinkedHashSet 加入循序和取出元素/数据的 循序一致
		//2.LinkedHashSet底层维护的是一个LinkedHashMap(是HashMap的子类)
		//3.LinkedHashSet底层结构 (数组table+双向链表)
		//4.添加第一次时，直接将table扩容到16,存放的结点类型是LinkedHashSet$Entry
		//5.
	}
}
class Customer{
	private String name;
	private int no;
	public Customer(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", no=" + no + "]";
	}
}