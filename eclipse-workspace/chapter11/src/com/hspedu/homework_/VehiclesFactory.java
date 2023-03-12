package com.hspedu.homework_;

public class VehiclesFactory {
	
	//马儿始终是同一匹
	//使用饿汉式
	private static Horse horse = new Horse();
	//私有化构造器
	private VehiclesFactory() {}
	//创建交通工具工厂类，有两个方法分别获得交通工具Horse,Boat
	//不想去创建工厂类对象，所以它的方法做成static，比较方便
	public static Horse getHorse() {
//		return new Horse();
		return horse;
	}
	
	public static Boat getBoat() {
		return new Boat();//船每次用新的
	}
	
	public static Plane getPlane() {
		return new Plane();//使用飞机
	}
}
