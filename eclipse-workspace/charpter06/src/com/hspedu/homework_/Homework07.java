package com.hspedu.homework_;

public class Homework07 {
	public static void main(String[] args) {
		new Demo().test();//匿名对象
		new Demo("john").test();//匿名
	}

}
class Test{
	String name = "Rose";
	Test(){
		System.out.println("Test");//(1)
	}
	Test(String name){//name john
		this.name = name;//属性没有动态绑定机制，将父类name改为john
	}
}
class Demo extends Test{
	String name = "jack";
	Demo(){
		super();//默认调用父类无参构造器
		System.out.println("Demo");//(2)
	}
	Demo(String s){
		super(s);
	}
	public void test() {
		System.out.println(super.name);//(3)Rose (5)john
		System.out.println(this.name);//(4)Jack (6)Jack遵循哪里声明那里使用
	}
	
}