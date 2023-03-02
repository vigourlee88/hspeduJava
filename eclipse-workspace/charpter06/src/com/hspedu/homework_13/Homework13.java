package com.hspedu.homework_13;

import java.util.Iterator;

public class Homework13 {
	public static void main(String[] args) {
		
		//测试
		Student student = new Student("小明",'男',15,"00023102");
		student.printInfo();//封装的体现
		
		Teacher teacher = new Teacher("张飞",'男',30,5);
		System.out.println("====================");
		teacher.printInfo();
		
		//定义多态数组，里面保存2个学生和2个老师。要求按年龄从高到低的排序
		
		Person[] persons = new Person[4];
		persons[0] = new Student("jack",'男',10,"0001");
		persons[1] = new Student("mary",'女',20,"0002");
		persons[2] = new Teacher("smith",'男',36,5);
		persons[3] = new Teacher("scott",'男',26,1);
	
		//创建对象
		Homework13 homework13 = new Homework13();
		homework13.bubbleSort(persons);
		
		//排序后的数组
		System.out.println("-----排序后的数组-----");
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);//默认调用toString()
		}
		
		//遍历数组，调用test()方法
		System.out.println("===================");
		for (int i = 0; i < persons.length; i++) {
			//遍历多态数组，由test方法判断是Student还是Teacher类型
			homework13.test(persons[i]);
		}
		
	}
	//定义方法 ，形参为Person类型，
	//功能: 调用学生的study()或者教师的teach()
	//分析这里会使用到 向下转型 和 类型转换
	//父类的引用会指向子类的对象
	public void test(Person p) {
		if(p instanceof Student) {//p的运行类型是Student
		    ((Student) p).study();	
		}else if(p instanceof Teacher) {
			((Teacher) p).teach();	
		}else {
			System.out.println("do nothing...");
		}	
	}
	
	
	//方法,完成年龄从高到低排序 
	//接收一个数组，数组传递是引用传递
	public void bubbleSort(Person[] persons) {
		
		Person temp = null;
		
		for (int i = 0; i < persons.length-1; i++) {
			for (int j = 0; j < persons.length-1-i; j++) {
				
				//判断的条件从高到低,这里的条件可以根据需要变化
				if(persons[j].getAge() <persons[j+1].getAge()) {
					
					temp = persons[j];
				    persons[j] = persons[j+1];
				    persons[j+1] = temp;
				}
				
			}
		}
	}

}
