package com.hspedu.homework_;

public class Homework06 {
	
	//唐僧要过火焰山，要使用飞机=>程序的扩展性
	public static void main(String[] args) {
		Person tang =new Person("唐僧",new Horse());
		tang.common();
		tang.passRiver();
		tang.common();
		tang.passRiver();
		tang.passRiver();
		tang.passRiver();
		//过火焰山
		tang.passFireHill();
	}
}
