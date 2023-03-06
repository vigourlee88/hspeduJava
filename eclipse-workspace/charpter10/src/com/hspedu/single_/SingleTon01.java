package com.hspedu.single_;

public class SingleTon01 {
	public static void main(String[] args) {
//		GirlFriend xh = new GirlFriend("小花");
//		GirlFriend xb = new GirlFriend("小白");
		
		//通过方法可以获取对象
		GirlFriend instance= GirlFriend.getInstance();
		System.out.println(instance);		
		GirlFriend instance2= GirlFriend.getInstance();
		System.out.println(instance2);
		
		System.out.println(instance == instance2);//true
		
//		System.out.println(GirlFriend.n1);
		
	}

}
//有一个类 GirlFriend
//有且只有一个女朋友
class GirlFriend{
	
//	public static int n1 = 100;
	
	private String name;
	
	//为了能够在静态方法中，返回gf对象，需要将其修饰为static 
	private static GirlFriend gf = new GirlFriend("小红红");
	
	//如何保障我们只能创建一个GirlFriend对象
	//步骤 单例模式-饿汉式
	//1.将构造器私有化
	//2.在类的内部创建对象 该对象是static的
	//3.提供一个公共的static方法，返回gf对象
	private GirlFriend(String name) {
		System.out.println("构造器被调用...");
		this.name = name;
	}
	
	public static GirlFriend getInstance() {
		return gf;
	}

	@Override
	public String toString() {
		return "GirlFriend [name=" + name + "]";
	}
}