package com.hspedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
	public static void main(String[] args) {
		Map hashMap = new HashMap();
		hashMap.put(1,new Emp("jack",30000,1));
		hashMap.put(2,new Emp("tom",1000,2));
		hashMap.put(3,new Emp("milan",12000,3));
		
		//遍历显示工资大于18000的员工
		//1.使用keySet=>增强for
		Set keySet = hashMap.keySet();
		System.out.println("===第一种遍历方式===");
		for (Object key : keySet) {
			//先获取value
			Emp emp = (Emp) hashMap.get(key);
			if(emp.getSal() > 18000) {
				System.out.println(emp);
			}
		}
		
		//2.使用EntrySet=>迭代器
		Set entrySet = hashMap.entrySet();
		System.out.println("===第二种遍历方式===");
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry =(Map.Entry) iterator.next();
			//通过entry 取得key value
			Emp emp = (Emp) entry.getValue();
			if(emp.getSal() > 18000) {
				System.out.println(emp);
			}	
		}
	}
}
class Emp{
	private String name;
	private double sal;
	private int id;
	public Emp(String name, double sal, int id) {
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", id=" + id + "]";
	}
	
}