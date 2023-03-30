package com.hspedu.customergeneric_;

import java.util.Arrays;

public class CuntomerGeneric_ {
	public static void main(String[] args) {
		
	}
}
//1.Tiger后面是泛型，所以我们把Tiger称为自定义泛型
//2.T,R,M 泛型的标志符，一般是单个大写字母
//3.泛型的标志符可以有多个
//4.普通成员可以使用泛型(属性，方法)
//5.使用泛型的数组，不可以初始化
//6.静态方法中不能使用类的泛型
class Tiger<T,R,M>{
	String name;
	R r;//属性使用泛型
	M m;
	T t;
	//T[] ts = new T[]();//Cannot create a generic array of T
	//因为数组在new 不能确定T的类型，就无法在内存开辟空间
	T[] ts;
	
	public Tiger(String name) {
		super();
		this.name = name;
	}
	public Tiger(String name, R r, M m, T t) {
		super();
		this.name = name;
		this.r = r;
		this.m = m;
		this.t = t;
	}
	//Cannot make a static reference to the non-static type M
	//static静态是和类相关的 ，在类加载时，对象还没有创建
	//所以静态方法和静态属性使用了泛型，JVM就无法完成初始化
//	static R r2;
//	public static void m1(M m) {
//		
//	}
	//方法使用泛型
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public R getR() {
		return r;
	}
	public void setR(R r) {
		this.r = r;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Tiger [name=" + name + ", r=" + r + ", m=" + m + ", t=" + t + ", ts=" + Arrays.toString(ts) + "]";
	}
	
}