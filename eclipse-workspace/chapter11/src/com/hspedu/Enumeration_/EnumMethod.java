package com.hspedu.Enumeration_;

//演示Enum类的各种方法的使用
public class EnumMethod {
	public static void main(String[] args) {
		//以Season03为例演示各种枚举方法
		Season03 autumn = Season03.AUTUMN;
		
		//输出枚举对象的名称
		System.out.println(autumn.name());
		
		//ordinal() 输出的是该枚举对象的次序/编号 从0开始编号
		System.out.println(autumn.ordinal());
		
		//从反编译可以看出 values方法，返回Season03[]
		//含有定义的所有枚举对象
		Season03[] values = Season03.values();
		for(Season03 seasons : values) {//增强for循环
			System.out.println(seasons);
		}
		
		//valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
		//执行流程
		//1.根据你输入的"AUTUMN"到Season03枚举对象中查找
		//2.如果找到了，就返回，如果没有找到就报错
		Season03 autumn1 = Season03.valueOf("AUTUMN");
		System.out.println("autumn1=" + autumn1);
		System.out.println(autumn == autumn1);
		
		//compareTo 比较两个枚举常量，比较的就是编号
		/*
		 * public final int compareTo(E o){
		 * return self.ordinal - other.ordinal;
		 */
		System.out.println(Season03.AUTUMN.compareTo(Season03.SUMMER));
		
	}
}
