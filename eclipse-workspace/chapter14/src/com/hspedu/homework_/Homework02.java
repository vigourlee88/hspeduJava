package com.hspedu.homework_;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class Homework02 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		Car car = new Car("宝马",400000);
        Car car2 =new Car("宾利",5000000);
        //1.添加单个元素
        arrayList.add(car);
        arrayList.add(car2);
        System.out.println(arrayList);
        //2.删除指定元素
        arrayList.remove(car);
        System.out.println(arrayList);
        //3.查找元素是否存在
        System.out.println(arrayList.contains(car2));
        //4.获取元素个数
        System.out.println(arrayList.size());
        //5.是否为空
        System.out.println(arrayList.isEmpty());
        //6.清空
        //arrayList.clear();
        //7.添加多个元素
        System.out.println(arrayList);
        arrayList.addAll(arrayList);//2个宾利
        System.out.println(arrayList);
        //8.查找多个元素是否都存在
        System.out.println(arrayList.containsAll(arrayList));//T
        //9.removeAll删除多个元素
        //arrayList.removeAll(arrayList);//相当于清空
        //遍历
        System.out.println("===增强for遍历集合===");
        for (Object o : arrayList) {
			System.out.println(o);
		}
        System.out.println("===迭代器遍历集合===");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}   
	} 
}
class Car{
	private String name;
	private double price;
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
