package com.hspedu.generic_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class GenericExercise {
	public static void main(String[] args) {
		//1.使用泛型方式给HashSet放入3个学生对象
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("john",12));
		set.add(new Student("tom",20));
		set.add(new Student("mary",19));
		//使用泛型后，下面语句会报错
		//set.add(100);
		//遍历
		System.out.println("====增强for遍历====");
		for (Student student : set) {
			System.out.println(student);
		}
		System.out.println("====迭代器遍历====");
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			//使用泛型后，快捷键会自动返回Student类型
			Student student = (Student) iterator.next();
			System.out.println(student);
		}

		//2.使用泛型方式给HashMap放入3个学生对象
		//泛型在创建对象时指定了，就立即生效，编译器按照规范来检查，约束数据类型
		HashMap<String, Student> hm = 
				new HashMap<String,Student>();
		/*
		 * K = String; V = Student;
		 * public class HashMap<K,V>{}
		 */
		hm.put("milan", new Student("milan",38));
		hm.put("smith", new Student("smith",48));
		hm.put("hsp", new Student("hsp",28));
		
		System.out.println("===使用entrySet和迭代器遍历===");
		//先把entrySet取出来，再迭代器遍历
		Set<Entry<String, Student>> entries = hm.entrySet();
		/*
		 * 源码
		 * public Set<Map.Entry<String,Student>> entrySet() {
               Set<Map.Entry<K,V>> es;
               return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
           }
		 * 
		 */
		Iterator<Entry<String, Student>> iterator2 = entries.iterator();
		/*
		 * public final Iterator<Map.Entry<K,V>> iterator() {
            return new EntryIterator();
            //调用iterator()后，返回类型是Iterator<Map.Entry<K,V>>
         }
		 */
		while (iterator2.hasNext()) {
			Map.Entry<String, Student> next = (Map.Entry<String, Student>) iterator2.next();
			System.out.println(next.getKey() + "-"+ next.getValue());
			
		}
		//使用keySet遍历
		System.out.println("===使用keySet和增强for遍历===");
		Set<String> keySet = hm.keySet();
        for (String string : keySet) {
        	System.out.println(string + "-" + hm.get(string));
			
		}
		
	}
}
class Student{
	public String name;
	public int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}