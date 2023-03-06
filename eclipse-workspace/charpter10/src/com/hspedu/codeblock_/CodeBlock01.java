package com.hspedu.codeblock_;

public class CodeBlock01 {
	public static void main(String[] args) {
		
		Movie movie = new Movie("你好，李焕英");
		System.out.println("==================");
		Movie movie2 = new Movie("唐探3",100,"陈思成");
	}

}
class Movie{
	private String name;
	private double price;
	private String director;
	
	//3个构造器 构成重载
	//三个构造器都有相同的语句
	//这时可以把相同的语句，放入到一个代码块中，即可
	//当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
	//代码块调用的顺序要优先于构造器
	
	{	
	System.out.println("电影屏幕打开...");
	System.out.println("广告开始...");
	System.out.println("电影正式开始...");
	};
	
	public Movie(String name) {
		super();
		System.out.println("Movie(String name) 被调用...");
		this.name = name;
	}
	
	public Movie(String name, double price) {
		super();	
		this.name = name;
		this.price = price;
	}

	public Movie(String name, double price, String director) {
		super();
		System.out.println("Movie(String name, double price, String director) 被调用...");
		this.name = name;
		this.price = price;
		this.director = director;
	}
	
}