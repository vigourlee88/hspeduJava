package com.hspedu.generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("tom",2000, new MyDate(2000,11,11)));
		employees.add(new Employee("jack",12000, new MyDate(2001,12,12)));
		employees.add(new Employee("hsp",50000, new MyDate(1980,10,10)));
		//ArrayList是数组，可以直接打印出来
		System.out.println("employees=" + employees);
		
		System.out.println("===对雇员进行排序===");
		employees.sort(new Comparator<Employee>(){
			@Override
			public int compare(Employee emp1, Employee emp2) {
				//先按照name排序，如果name相同，则按生日日期的先后顺序。
				//即定制排序
				//先对传入的参数emp1和emp2进行验证
				if(!(emp1 instanceof Employee && emp2 instanceof Employee)) {
					System.out.println("类型不正确..");
					return 0;
				}
				//比较name 得到比较结果i，影响排序后的结果
				int i = emp1.getName().compareTo(emp2.getName());
				if(i != 0 ) {
					return i;
				}
				//下面是对birthday的比较，因此，我们最好把这个比较，放在MyDate类中
				return emp1.getBirthday().compareTo(emp2.getBirthday());
				
			}
			/*	//如果name相同，就比较birthday-year
				int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
				if(yearMinus != 0) {
					return yearMinus;
				}
				//如果year 相同，就比较month
				int monthMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
				if(monthMinus != 0) {
					return monthMinus;
				}
				//如果year month相同，
				return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();
				
			}
			*/
			
		});
		System.out.println(employees);
	}
}	
class Employee{
	private String name;
	private double sal;
	private MyDate birthday;
	public Employee(String name, double sal, MyDate birthday) {
		super();
		this.name = name;
		this.sal = sal;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "\nEmployee [name=" + name + ", sal=" + sal + ", birthday=" + birthday + "]";
	}
}
//implements Comparable<MyDate>
//public int compareTo(MyDate o) {/
class MyDate implements Comparable<MyDate>{
	private int year;
	private int month;
	private int day;
	public MyDate(int year, int month, int day) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	@Override
	public int compareTo(MyDate o) {//把year-month-day放在这里
		
		int yearMinus = this.year - o.getYear();
		if(yearMinus != 0) {
			return yearMinus;
		}
		//如果year 相同，就比较month
		int monthMinus = month - o.getMonth();
		if(monthMinus != 0) {
			return monthMinus;
		}
		//如果year month相同，
		return day - o.getDay();
	}
  
}