package com.hspedu.set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
	public static void main(String[] args) {
		
		/*1.构造器源码
		 * public HashSet(){
		 *  map = new HashMap<>();
		 * }
		 * 2.HashSet 可以存放null,但是只能有1个null，即元素不重复
		 * 
		 */
		Set set =new HashSet();
		set.add(null);
		set.add(null);
		System.out.println("set=" + set);
	}

}
