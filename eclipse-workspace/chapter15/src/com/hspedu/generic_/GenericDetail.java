package com.hspedu.generic_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class GenericDetail {
	public static void main(String[] args) {
		//1.给泛型指定数据类型是，要求是引用类型，不能是基本数据类型
		List<Integer> list = new ArrayList<Integer>();
		//List<int> list2 = new ArrayList<int>();//错误
		
		//2.
		//因为E 指定了A类型，构造器传入了new A()
		//在给泛型指定具体类型后，可以传入该类型或者其子类类型
		 Pig<A> aPig = new Pig<A>(new A());
		 aPig.f();
		 Pig<A> aPig2 = new Pig<A>(new B());
		 aPig2.f();
		 
		 //3.泛型的使用形式
		 ArrayList<Integer> list3 = new ArrayList<Integer>();
		 //List接口引用接收也ok
		 List<Integer> list4 = new ArrayList<Integer>();
		 //在实际开发中，往往简写
		 //编译器会进行类型推断
		 ArrayList<Integer> list5 = new ArrayList<>();
		 List<Integer> list6 = new ArrayList<>();
		 ArrayList<Pig> pigs = new ArrayList<>();
		 
		 //4.如果是这样写 泛型默认是Object e
		 ArrayList arrayList = new ArrayList();
		 //等价
		 ArrayList<Object> arrayList2 = new ArrayList<>();
		 arrayList2.add("xx");
		 /*
		  * public boolean add(E e){ E = Object
		  *   ensurecapacityInternal(size + 1);
		  *   elementData[size++] = e;
		  *   return true;
		  *   }
		  */
		 
		 Tiger tiger = new Tiger();
		 /*
		  * 
		  * class Tiger {//类
				Object e;
				public Tiger() {}
				public Tiger(Object e) {
					super();
					this.e = e;
				}
			}
		  * 
		  */
	}
}
class Tiger<E>{//类
	E e;

	public Tiger() {}
	public Tiger(E e) {
		super();
		this.e = e;
	}
}
class A{}
class B extends A{}

class Pig<E>{
	E e;//用泛型指定类的属性

	public Pig(E e) {
		super();
		this.e = e;
	}
	
	public void f() {
		System.out.println(e.getClass());//运行类型
	}
	
}