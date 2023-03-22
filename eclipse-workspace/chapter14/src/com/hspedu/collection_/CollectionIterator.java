package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Collection col = new ArrayList();
		
		col.add(new Book("三国演义","罗贯中",10.1));
		col.add(new Book("小李飞刀","古龙",5.1));
		col.add(new Book("红楼梦","曹雪芹",34.6));
		
		//System.out.println("col=" + col);
		//遍历集合
		//1.先得到col 对应的迭代器
		//实现了接口Collection的子类，都必须实现iterator方法
		Iterator iterator = col.iterator();
		//2.使用while循环遍历
	//	while(iterator.hasNext()) {
			//运行类型是存放的什么对象
	//		Object obj = iterator.next();
	//		System.out.println("obj=" + obj);
	//  }
			while (iterator.hasNext()) {
				Object obj = iterator.next();
				System.out.println("obj=" + obj);
			}
			//3.当退出while循环后，这时迭代器iterator指向最后的元素
			//iterator.next();//抛出NoSuchElementException
			//4.如果希望再次遍历，需要重置我们的迭代器
			iterator = col.iterator();
			System.out.println("==第二次遍历==");
			while (iterator.hasNext()) {
				Object obj = iterator.next();
				System.out.println("obj=" + obj);
			}
	}
			
}

class Book{
	private String name;
	private String author;
	private double price;
	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
}