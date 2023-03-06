package com.hspedu.codeblock_;

public class CodeBlockExercise02 {
	public static void main(String[] args) {
		//先类的加载，静态属性初始化 和 静态代码块
		//再调用构造器 隐藏了super();普通属性初始化和普通代码块
		Test a = new Test();
	}

}
class Sample{
	Sample(String s){
		System.out.println(s);
	}
	Sample(){
		System.out.println("Sample默认构造器函数被调用");
	}
}
class Test{
	Sample sam1= new Sample("sam1成员初始化");
	static Sample sam = new Sample("静态成员sam初始化");
	static {
		System.out.println("static块执行");
		if(sam == null)
			System.out.println("sam is null");
	}
	Test(){
		//隐式调用  普通属性初始化 和 普通代码块
		System.out.println("Test默认构造函数被调用");
	}
}