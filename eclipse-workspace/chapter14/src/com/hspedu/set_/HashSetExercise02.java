package com.hspedu.set_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class HashSetExercise02 {
	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet<>();
		hashSet.add(new Employee01("张三",25,new MyDate(1996,7,25)));
		hashSet.add(new Employee01("张三",25,new MyDate(1996,8,25)));
		hashSet.add(new Employee01("张三",25,new MyDate(1996,7,25)));
		
		System.out.println("hashSet=" + hashSet);
	}
}

class Employee01{
	private String name;
	private double sal;
	private MyDate date;
	public Employee01(String name, double sal, MyDate date) {
		super();
		this.name = name;
		this.sal = sal;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee01 [name=" + name + ", sal=" + sal + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee01 other = (Employee01) obj;
		return Objects.equals(date, other.date) && Objects.equals(name, other.name);
	}
}

class MyDate{
	public int year;
	public int month;
	public int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
}
