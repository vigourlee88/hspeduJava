package com.hspedu.map_;

import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings("all")
public class HashMapSource02 {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		for(int i = 1;i <= 12;i++) {
			hashMap.put(new A(i), "hello");
		}
		hashMap.put("aaa","bbb");
		System.out.println("hashMap="+ hashMap);//12个k-v
		//table的扩容 临界值threshold
		//0->16(12)->32(24)->64(64*0.75=48)->128(96)
	}
}
class A{
	private int num;
	public A(int num) {
		this.num = num;
	}
	//所有的A对象的hashCode一样
//	@Override
//	public int hashCode() {
//		return 100;
//	}
	@Override
	public String toString() {
		return "\nA [num=" + num + "]";
	}
	
}