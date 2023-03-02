package com.hspedu.object_;

public class Finalize_ {
	public static void main(String[] args) {
		
		Car bmw = new Car("宝马");
		//自空，car对象就是一个垃圾,
		//垃圾回收器就会回收(销毁)对象
		//会调用该对象的finalize方法
		//程序员就可以 finalize中，写自己的业务逻辑代码
		//(比如释放资源:数据库连接，或者打开文件..)
		//如果程序员不重写 finalize,那么就会调用 Object类的finalize,即默认处理
		//如果程序员重写了finalize,就可以实现自己的逻辑
		bmw = null;//自空，不是马上就回收，有自己的逻辑
		System.gc();//运行垃圾回收器，主动调用垃圾回收器
		
		System.out.println("程序退出了....");
		

	}
}
class Car{
	//属性, 资源..
	private String name;
	
	public Car(String name) {
		this.name= name;
	}
	
	//重写finalize
	
	@Override
	protected void finalize() throws Throwable{
		//super.finalize();
		System.out.println("我们销毁 汽车" + name);
		System.out.println("释放了某些资源...");
	}
}
