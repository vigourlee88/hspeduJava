package com.hspedu.poly_.detail_;

public class PolyDetail {
	public static void main(String[] args) {
		
		//向上转型 父类的引用指向了子类的对象
		Animal animal = new Cat();
		Object obj = new Cat();//Animal继承上一级Object父类也成立
		
		//向上转型调用方法的规则如下
		//可以调用父类中的所有成员(需遵守访问权限)
		//但是不能调用子类的特有的成员-抓老鼠的方法
		//因为在编译阶段，能调用哪些成员是由编译类型来决定的
		//animal.catchMouse();错误
		
		//最终运行效果看子类(运行类型)的具体实现,
		//即调用方法时，按照从子类开始查找方法，然后调用，同方法调用规则一样
		//运行时从Cat中找eat()
		animal.eat();//猫吃鱼
		animal.run();//跑
		animal.sleep();//hello,你好
		animal.show();//睡
		
		//希望调用Cat的 catchMouse()
		//多态的向下转型
		//语法 子类类型 引用名= (子类类型) 父类引用
		Cat cat = (Cat) animal;
		cat.catchMouse();//cat的编译运行Cat，运行类型也是Cat
		//要求父类的引用必须指向的是当前目标类型的对象
		//Dog dog = (Dog) animal;classCastException报错
	}

}
