package com.hspedu.homework_;

public class Person {
	private String name;
	private Vehicles vehicles;
	
	//在在创建人对象时，事先给他分配一个交通工具
	public Person(String name, Vehicles vehicles) {
		super();
		this.name = name;
		this.vehicles = vehicles;
	}
	//实例化Person对象"唐僧"，要求一般情况下用Horse作为交通工具，
	//遇到大河时用Boat作为交通工具
	//这里涉及到一个编程思想，可以把具体要求 封装成方法
	//如何不浪费，在构建对象时，传入的交通工具对象
	public void passRiver() {
		//先得到船
//		Boat boat = VehiclesFactory.getBoat();
//		boat.work();
		
		//判断一下，当前vehicles属性是null,就获取一艘船
		//如何防止始终传入的马 instanceof
		//if(vehicles == null) {
		//!(vehicles instanceof Boat)是判断当前的vehicles是不是船
		//(1)vehicles为null,vehicles instanceof Boat结果为false
		//(2)vehicles为马对象,vehicles instanceof Boat结果为false
		//(3)vehicles为船对象,vehicles instanceof Boat结果为true
		if(!(vehicles instanceof Boat)) {	
			vehicles = VehiclesFactory.getBoat();
		}
		vehicles.work();
	}
	
	public void common() {
		//得到马儿
		//判断一下，当前vehicles属性是null,就获取一匹马
		if(!(vehicles instanceof Horse)) {
			//这里使用的是多态，向下转型
			vehicles = VehiclesFactory.getHorse();
		}
		//这里体现使用接口调用
		vehicles.work();
	}
	//过火焰山
	public void passFireHill() {
		if(!(vehicles instanceof Plane)) {
			vehicles = VehiclesFactory.getPlane();
		}
		vehicles.work();
	}
}
