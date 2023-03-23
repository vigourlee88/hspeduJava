package com.hspedu.set_;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings("all")
public class LinkedHashSetExercise {
	public static void main(String[] args) {
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(new Car("奥拓",1000));//ok
		linkedHashSet.add(new Car("奥迪",300000));//ok
		linkedHashSet.add(new Car("奥拓",1000));//不同对象 hash值不同,重写hash()和equals
		
		System.out.println("linkedHashSet"+ linkedHashSet);
	}
}
class Car{
	private String name;
	private double price;
	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nCar [name=" + name + ", price=" + price + "]";
	}
	//重写equals和hashCode方法
	//当name和price相同时，就返回相同的hashCode值，equals返回true

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
}