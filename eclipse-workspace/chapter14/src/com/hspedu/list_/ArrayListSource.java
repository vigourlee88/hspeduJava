package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("all")
public class ArrayListSource {
	public static void main(String[] args) {
	
		//ArrayList底层源码
		//使用无参构造器创建ArrayList对象
		/*创建了一个空的数组elementData={}
		 * public ArrayList() {
         *   this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
         *}

		 */
		ArrayList list = new ArrayList();
	//	ArrayList list = new ArrayList(8);
		//使用for给list集合添加1-10数据
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
			/*
			 * list.add()
			 * 1.先确定是否要扩容
			 * 2.然后再执行 赋值
			 *  public boolean add(E e) {
		        ensureCapacityInternal(size + 1);
		        elementData[size++] = e;
		        return true;
		      }
		      该方法确定minCapacity
		      1.第一次扩容为10
		      private void ensureCapacityInternal(int minCapacity) {
		      if(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA){
		      minCapacity = Math.max(DEFAULT_CAPACITY,minCapacity);
		      }                       10                0
		      ensureExplicitCapacity(minCapacity);
		      }                        10
		      1.modCount++记录集合被修改的次数
		      2.如果elementData的大小不够，就调用grow()去扩容
		      private void ensureExplicitCapacity(int minCapacity) {
		          modCount++;
		          if(minCapacity - elementData.length > 0)
		          grow(minCapacity);
		      }
		      */
		      /*
		       * 1.真的扩容
		       * 2.使用扩容机制来确定要扩容到多大
		       * 3.第一次newCapacity = 10
		       * 4.第二次及其以后，按照1.5倍扩容
		       * 5.扩容使用的是Arrays.copyof()保护原先数据
		       private Object[] grow(int minCapacity) {
		        int oldCapacity = elementData.length;
		        
		        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
		            int newCapacity = ArraysSupport.newLength(oldCapacity,
		                    minCapacity - oldCapacity, 
		                    oldCapacity >> 1;
		            return elementData = Arrays.copyOf(elementData, newCapacity);
		        } else {
		            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
		        }
		      }
			            
			 */
		
		//添加11-15数据
		for (int i = 11; i <= 15; i++) {
			list.add(i);
		}
		list.add(100);
		list.add(200);
		list.add(null);
	    for(Object object :list) {
	    	System.out.println(object);
	    }
	}
}
