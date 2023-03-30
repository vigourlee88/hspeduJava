package com.hspedu.generic_;

public class Generic03 {
	public static void main(String[] args) {
		//E表示数据类型 ，该数据类型在定义Person对象的时候指定
	    //即在编译期间，就确定E是什么类型
		Person<String> person = new Person<String>("韩顺平教育");
		person.show();//String
		/*
		 * 上面的Person类
		 * E = String s;
		 */
		Person<Integer> person2 = new Person<>(100);
		person2.show();//Integer
		/*
		 * E = Integer i;
		 */
	}
}
//泛型的作用 可以在类声明时通过一个标识表示类中某个属性的类型，
//或者是某个方法的返回值的类型，或者是参数类型
class  Person<E>{//E 可以是自定义的类如Car,或者Integer,String类型
	E s;
	//E表示s的数据类型 ，该数据类型在定义Person对象的时候指定
    //即在编译期间，就确定E是什么类型
	public Person(E s) {//E也可以是参数类型
		super();
		this.s = s;
	}
	public E f() {
		return s;//返回类型使用E
	}
	public void show() {
		System.out.println(s.getClass());//显示s的数据类型
	}
}