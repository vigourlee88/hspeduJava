package com.hspedu.object_;

public class Equals01 {
	

	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		//==是一个比较运算符
		//如果判断引用数据类型，判断的是地址值是否相等，即两个对象指向一个地址
		System.out.println(a == c);//true
		System.out.println(b == c);//true
		
		B bObj = a;//bObj指向A对象
		System.out.println(bObj == c);//true
		
		int num1 = 10;
		double num2 = 10.0;
		//基本数据类型，判断的是值是否相等
		System.out.println(num1 == num2);//true
		
		
		/*
		 //jdk源码的String类的equals方法
		 //把Object的equals方法重写了，变成比较两个字符串的值是否相同
		  public boolean equals(Object anObject) {
			if(this == anObject ) {//如果是同一个对象
				return true;
			}
			if(anObject instanceof String) {//判断类型
				String anotherString = (String) anObject;//向下转型
				int n = value.length;
				if(n == anotherString.value.length) {//如果长度相同
					char v1[] = value;
					char v2[] = anotherString.value;
					int i = 0;
					while(n-- != 0) {//然后一个一个的比较字符
						if(v1[i] != v2[i])
							return false;
						i++;
					}
					return true;//如果两个字符串的所有字符都相等，则返回true
				}
			}
		
			return false;//如果比较的不是字符串，就直接返回false
		}
		*/
		
		//equals方法 查看源码
		"hello".equals("abc");
				
		
		//看看Object类的equals是
		/*
		//Object的equals方法默认就是比较对象地址是否相等
		//也就是判断两个对象是不是同一个对象
		public boolean equals(Object obj) {
			return (this== obj);//如果是同一个对象
		}
		*/
		
		Integer integer = new Integer(5);
		
		 /*
		  //从源码可以看到Integer也重写了Object的equals方法
		  //变成了判断两个值是否相同
	    public boolean equals(Object obj) {
	        if (obj instanceof Integer) {
	            return value == ((Integer)obj).intValue();
	        }
	        return false;
		    }
	     }
	     */
		Integer integer1 = new Integer(1000);
		Integer integer2 = new Integer(1000);
		System.out.println(integer1 == integer2);//两个不同的对象 false
		System.out.println(integer1.equals(integer2));//两个不同的对象的值是否相等 true
		
		String str1 = new String("hspedu");
		String str2 = new String("hspedu");
		System.out.println(str1 == str2);//false new了两次不是同一个对象
		System.out.println(str1.equals(str2));//true hspedu值一样
		
		
	}
}
	
class A extends B{}
class B {}
