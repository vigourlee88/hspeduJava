package com.hspedu.list_;

import java.util.ArrayList;

@SuppressWarnings("all")
public class ArrayDetail {
	public static void main(String[] args) {
		
		//ArrayList是线程不安全的，源码没有synchronized
		/*
		 * public boolean add(E e) {
	     *   modCount++;
	     *   add(e, elementData, size);
	     *   return true;
         *  }
		 */
		ArrayList arrayList = new ArrayList();
		arrayList.add(null);
		arrayList.add("jack");
		arrayList.add(null);
		System.out.println(arrayList);
	}
}
