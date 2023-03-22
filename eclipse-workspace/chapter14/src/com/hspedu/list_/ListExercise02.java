package com.hspedu.list_;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class ListExercise02 {	
	public static void main(String[] args) {
		List list = new LinkedList();
//		List list = new ArrayList();
//		List list = new Vector();
		list.add(new Book("红楼梦","曹雪芹",100));
		list.add(new Book("西游记","吴承恩",10));
		list.add(new Book("水浒传","施耐庵",19));
		list.add(new Book("三国演义","罗贯中",80));
		
		//遍历
		for (Object o : list) {
			System.out.println(o);
		}
		//对集合进行冒泡排序
		sort(list);
		
		System.out.println("====排序后====");
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		
	}
	//写一个静态方法
	public static void sort(List list) {
		//排序处理-遍历
		int listSize = list.size();
		for (int i = 0; i < listSize-1; i++) {
			for (int j = 0; j < list.size()-1-i ; j++) {
				//取出对象
				Book book1 = (Book) list.get(j);//取出的是对象，需要向下转型
				Book book2 = (Book) list.get(j+1);
				if(book1.getPrice() > book2.getPrice()) {
					//就进行交换 集合的交换改变set方法
					list.set(j, book2);
					list.set(j+1, book1);
				}
			}
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
		this.price = price;
		this.author = author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "名称:"+ name + 
				"\t价格:"+ price + 
				"\t作者:"+ author;
	}
}