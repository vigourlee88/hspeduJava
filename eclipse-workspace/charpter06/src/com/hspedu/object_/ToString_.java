package com.hspedu.object_;

public class ToString_ {
	public static void main(String[] args) {
		
		/*
		 Object类的toString源码
		 1.getClass().getName() 类的全类名(包名+类名)
		 2.Integer.toHexString(hashCode() 将对象的hashCode值转成16进制字符串
		 public String toString() {
		     return getClass().getName()
		     + "@" + Integer.toHexString(hashCode()); 
		 }

		 */
		Monster monster = new Monster("小妖怪","巡山的",1000);
		System.out.println(monster.toString() + " hashcode="
		            + monster.hashCode());//hashCode()是十进制
		
		//子类重写toString方法，用于返回对象的属性信息
		//重写toString方法，打印对象或拼接对象时，都会自动调用该对象的toString形式

		System.out.println("==当直接输出一个对象，toString 方法会被默认的调用==");
		System.out.println(monster);//等价调用 monstor.toString()
	}
}
class Monster{
	private String name;
	private String job;
	private double sal;
	
	public Monster(String name, String job, double sal) {
		super();
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	//重写toString方法，输出对象的属性值，也可自己指定
	@Override
	public String toString() {
		return "Monster [name=" + name +
					", job=" + job + 
					", sal=" + sal + 
					"]";
		
	}
	
	
	
	
}
