package com.hspedu.object_;

public class EqualsExercise01 {
	public static void main(String[] args) {
		
		Person person1 = new Person("jack",10,'男');
		Person person2 = new Person("jack",10,'男');
		//Person继承Object类的equals方法，
		//默认比较两个对象是否相等,
		//注意这里并未重写equals方法,
		//若重写了equals方法就变成判断两个值是否相等
		//System.out.println(person1.equals(person2));//false
		System.out.println(person1.equals(person2));//重写equals方法后 true
		
	}
}

/*
 * 判断两个Person对象的内容是否相等，
 * 如果两个Person对象的各个属性值都一样，
 * 则返回true
 * 反之false
 */
class Person{//默认继承Object
	private String name;
	private int age;
	private char gender;
	
	//重写Object的equals方法
	public boolean equals(Object obj) {
		//如果比较的两个对象是同一个对象，则直接返回true
		//指向同一个对象的属性肯定相同
		//this是当前对象，在调用这个方法时是Person，就指向Person
		if(this == obj) {
			return true;
		}
		//进行类型判断
		//传进来的对象是否是Person对象
		if(obj instanceof Person) {//是person我们才比较
			//进行 向下类型转换
			//因为 需要得到 传进来对象obj的 各个属性
			Person p = (Person) obj;
			
			//比较两个name的内容equals是否相等
			//两个age的值基本类型== 是否相等
		    //char是基本数据类型 用==比较
			return this.name.equals(p.name)
					&& this.age == p.age 
					&& this.gender ==(p.gender);
		}
		//如果不是person,则直接返回false
		return false;
		
	}
	public Person(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
