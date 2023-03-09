package com.hspedu.Enumeration_;

public class EnumExercise01 {
	public static void main(String[] args) {
		//BOY是final static的，可以直接调用属性
		Gender2 boy = Gender2.BOY;//静态对象赋值
		Gender2 boy2 = Gender2.BOY;
		
		//直接输出对象，本质是调用Gender2的父类(Enum类)的toString()方法
		//public String toString(){
		//     return name;
		//}
		System.out.println(boy);//输出BOY
		System.out.println(boy == boy2);//true
		
	}
}
enum Gender2{
	BOY,GIRL;
}
