package com.hspedu.homework_;

public class Homework15 {
	public static void main(String[] args) {
		AAA obj = new BBB();//向上转型  obj指向BBB的对象
	    AAA b1 = obj;//b1 也指向BBB的对象
		System.out.println("obj的运行类型"+obj.getClass());//BBB
		
		obj = new CCC();//向上转型  obj 指向CCC对象
		System.out.println("obj的运行类型"+obj.getClass());//CCC
		obj = b1;//把b1的地址赋给obj,或者obj指向b1的对象，b1指向BBB的对象
		System.out.println("obj的运行类型"+obj.getClass());//BBB
	}
	

}
class AAA{//超类
	
}
class BBB extends AAA{//父类
	
}
class CCC extends BBB{//子类
	
}