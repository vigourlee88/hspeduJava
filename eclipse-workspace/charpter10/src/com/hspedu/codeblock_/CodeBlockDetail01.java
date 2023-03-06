package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
	public static void main(String[] args) {
		
		//类被加载的情况举例
		//1.创建对象实例(new)
		//AA aa = new AA();
		
		//2.创建子类对象实例,父类也会被加载
		//而且，父类先被加载，子类后被加载
		//继承的本质  先加载父类，再加载子类
		//AA aa2 = new AA();
		
		//3.使用类的静态成员时(静态属性，静态方法)
		//继承的本质  先加载父类，再加载子类
		//System.out.println(Cat.n1);
		
		//4.static代码块，是在类加载时，执行的，而且只会执行一次
		//DD dd = new DD();
		//DD dd1 = new DD();
		
		//5.普通代码块，在创建对象实例时，会被隐式的调用
		//被创建一次，就会调用一次
		//6.如果只是使用类的静态成员，普通代码块并不会执行
		
		System.out.println(DD.n1);
		//DD.n1 会导致类的加载，静态代码块 一定会执行
		//普通代码块 在创建对象时 才会被执行
		//输出  DD 的静态代码块1被执行...
		//      8888

	}
}
class DD{
	
	public static int n1 = 8888;//静态属性
	//静态代码块
	static {
		System.out.println("DD 的静态代码块1被执行...");
	}
	//普通代码块 在new对象时 被调用。而且每创建一个对象，就调用一次
	//普通代码块 是构造器的补充
    {
		System.out.println("DD 的普通代码块...");
	}
}
class Animal{
	//静态代码块
	static {
		System.out.println("Animal 的静态代码块1被执行...");
	}
	
}
class Cat extends Animal{
	
	public static int n1 = 999;//静态属性
	//静态代码块
	static {
		System.out.println("Cat 的静态代码块1被执行...");
	}
}

class BB {
	//静态代码块
	static {
		System.out.println("BB 的静态代码块1被执行...");
	}
}

class AA extends BB{
	//静态代码块
	static {
		System.out.println("AA 的静态代码块1被执行...");
	}
}