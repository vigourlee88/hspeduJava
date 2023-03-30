package com.hspedu.customergeneric_;

public class CustomerMethodExercise {
	public static void main(String[] args) {
		//T-> String,R->Integer,M ->Double
		Apple<String,Integer,Double> apple = new Apple<>();
		apple.fly(10);//泛型是引用类型，所以10会被自动装箱->Integer
		apple.fly(new Dog());
		//new Dog() 传给E e,编译器会判断运行类型是Dog
	}
}
class Apple<T,R,M>{//自定义泛型类
	public <E> void fly(E e) {//泛型方法
		System.out.println(e.getClass().getSimpleName());
	}
	//public void eat(U u) {}	
	//想要使用泛型类中的泛型
	//错误，因为U没有声明(泛型类和泛型方法中都没有声明U)
	public void run(M m) {}//方法中使用泛型类中的泛型标识符
}
class Dog{}
	
