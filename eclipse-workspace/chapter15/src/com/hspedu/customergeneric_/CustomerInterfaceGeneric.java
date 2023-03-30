package com.hspedu.customergeneric_;

public class CustomerInterfaceGeneric {
	public static void main(String[] args) {
		
	}
}
/*
 * 泛型接口使用的说明
 * 1.接口中，静态成员也不能使用泛型
 * 2.泛型接口的类型，在继承接口或者实现接口时确定
 */

interface IUsb<U,R>{
	int n = 10;
	//U name = "hsp";接口中它的成员都是静态的，不能使用泛型
	//普通方法中，可以使用接口泛型
	R get(U u);
	
	void hi(R r);
	
	void run(R r1,R r2,U u1,U u2);
	
	//在jdk8中，可以在接口中，使用默认方法也可使用泛型
	default R method(U u) {
		return null;	
	}
}
//在继承接口 指定泛型接口的类型
interface IA extends IUsb<String,Integer>{}
//当我们去实现IA接口时，因为IA在继承IUsb接口时，指定了U为String,R为Double
//在实现IUsb接口的方法时,使用String替换U,Double替换R
class AA implements IA{

	@Override
	public Integer get(String u) {
		return null;
	}

	@Override
	public void hi(Integer r) {
	
	}

	@Override
	public void run(Integer r1, Integer r2, String u1, String u2) {
		
	}
}
//实现接口时，直接指定泛型接口的类型
//给U执行Integer,给R指定Float
//当我们实现IUsb方法时，会使用Integer替换U,Float替换R
class BB implements IUsb<Integer,Float>{
	@Override
	public Float get(Integer u) {
		return null;
	}

	@Override
	public void hi(Float r) {
	
	}

	@Override
	public void run(Float r1, Float r2, Integer u1, Integer u2) {
	
	}
}
//没有指定类型，默认为Object
class CC implements IUsb{
//等价class CC implements IUsb<Object,Object>{}
	@Override
	public Object get(Object u) {
		return null;
	}

	@Override
	public void hi(Object r) {
	
	}

	@Override
	public void run(Object r1, Object r2, Object u1, Object u2) {
	
	}
}