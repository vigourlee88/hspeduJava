package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0]= new Book("红楼梦",100);
		books[1]= new Book("金瓶梅新",90);
		books[2]= new Book("青年文摘20年",5);
		books[3]= new Book("java从入门到放弃",300);
		
		//1.按照price从大到小
		Arrays.sort(books,new Comparator<Object>() {
			//这里是对Book数组排序，因此o1和o2就是Book对象

			@Override
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				double priceVal =book2.getPrice()- book1.getPrice();
				//这里进行了一个转换
				//如果发现结果和我们输出的不一致，就修改一下返回的1和-1
				if(priceVal > 0) {
					return 1;
				}else if(priceVal < 0) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.println(Arrays.toString(books));
		
		//1.按照书名从大到小
		Arrays.sort(books,new Comparator<Object>() {
			//这里是对Book数组排序，因此o1和o2就是Book对象
	
			@Override
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				//按照书名的长度进行排序
				return book2.getName().length()- book1.getName().length();
			}
		});
		
		System.out.println(Arrays.toString(books));
	}	
}
class Book{
	private String name;
	private double price;
	public Book(String name, double price) {
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
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
