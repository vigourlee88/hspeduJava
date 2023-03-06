package com.hspedu.static_;

public class StaticExercise03 {
	public static void main(String[] args) {
		Person01.setTotalPerson(3);
		new Person();//4
	}

}
class Person01{
	private int id;
	private static int total = 0;
	
	public static void setTotalPerson(int total) {
		//this.total = total;//错误，static方法中 不能使用this
		Person01.total = total;//正确
	}
	
	public Person01() {
		total++;
		id = total;
	}
}