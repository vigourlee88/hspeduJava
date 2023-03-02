package com.hspedu.poly_.exercise_;

public class PolyExercise02 {
	public static void main(String[] args) {
		
		Sub s = new Sub();
		//访问属性看编译类型Sub-> count = 20;
		System.out.println(s.count);//20
		//访问方法查找关系从运行类型查找Sub-> Sub display()this.count
		s.display();//20
		//向上转型 把子类引用 赋给 父类引用
		Base b = s;
		System.out.println(b == s);//true 对象比较看地址
		System.out.println(b.count);//10
		b.display();//20
	}

}
class Base{
	int count = 10;
	public void display() {
		System.out.println(this.count);
	}
}
class Sub extends Base{
	int count = 20;
	public void display() {
		System.out.println(this.count);
	}
}