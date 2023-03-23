package com.hspedu.list_;

import java.util.Vector;

@SuppressWarnings("all")
public class Vector_ {
	public static void main(String[] args) {
		
		Vector vector = new Vector();
		for (int i = 0; i < 10; i++) {
			vector.add(i);
		}
		vector.add(100);
		System.out.println("vector=" +vector);
		//1.new Vector()底层
	    /*补充 如果是有参构造
	     * 走的方法
	     * public Vector(int initialCapacity){
	     *    this(initialCapacity,0);
	     *    }
	     * 2.vector.add(i);
	     * 2.1下面的方法就添加数据到vector集合
	      public synchronized boolean add(E e) {
	        modCount++;
	        add(e, elementData, elementCount);
	        return true;
	    　}
	    2.2确定是否需要扩容，
	    条件minCapacity-elementData.length> 0
	      private void ensureCapacityHelper(int minCapacity){
	       if(minCapacity - elementData.length > 0){
	        grow(minCapacity);
	       }
	     2.3如果需要的数组大小，不够用，就扩容
	     扩容的算法
	      newCapacity = oldCapacity + 
	                ((capacityIncrement > 0)?
	                capacityIncrement : oldCapacity);
	     * 
	     */
	}
}
