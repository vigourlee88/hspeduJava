package com.hspedu.Annotation_;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes","unchecked","unused"})
public class SuppressWarnings_ {

	//1.当我们不希望看到这些警告的时候
	//可以使用SuppressWarnings注解来抑制警告信息
	//2.在{""}中，可以写入你希望抑制(不显示)警告信息
	//3.可以指定的警告类型...
	//4.作用范围 是和放置的位置相关
	// 比如放置在main方法，那么抑制范围就是main
	//通常我们可以放置具体的语句，方法，类。
	//5.看源码
	//(1)放置的位置 TYPE FIELD METHOD PARAMETER CONSTRUCTOR LOCAL_VARIABLE)
	//(2)该注解类有数组 设置一个数组比如{"rawtypes","unchecked","unused"}
	/*
	 * @Retention(RetentionPolicy.SOURCE)
      public @interface SuppressWarnings {
             String[] value();
      }
	 */
	
	@SuppressWarnings({"all"})
	public static void main(String[] args) {		
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");	
		int i;
		System.out.println(list.get(1));
	}
	
	public void f1() {
//		@SuppressWarnings({"rawtypes"})
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");	
//		@SuppressWarnings({"unused"})
		int i;
		System.out.println(list.get(1));
	}
}
