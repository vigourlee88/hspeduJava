package com.hspedu.list_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

@SuppressWarnings("all")
public class LinkedListCRUD {
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println("linkedList=" + linkedList);
		
		//演示一个删除结点的源码
		linkedList.remove();//默认删除第一个结点
		//linkedList.remove(2);
		System.out.println("linkedList=" + linkedList);
		
		//修改某个结点对象
		linkedList.set(1, 999);
		System.out.println("linkedList=" + linkedList);
		
		//得到某个结点对象
		//得到双向链表的第二个对象
		Object o = linkedList.get(1);
		System.out.println(o);
		
		//因为LinkedList是实现了List接口，遍历方式
		System.out.println("===LinkedList遍历迭代器===");
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println("next="+ next);
		}
		System.out.println("===LinkedList增强for===");
		for (Object obj : linkedList) {
			System.out.println("obj=" + obj);
		}
		System.out.println("===LinkedList普通for===");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		/*
		 * 1.LinkedList linkedList = new LinkedList();
		 *   public LinkedList(){
		 *   }
		 * 2.这时linkedList的属性first =null;last =null;
		 * 3.执行add方法
		 * public boolean add(E e) {
		        linkLast(e);
		        return true;
		    }
		    4.将新的结点，加入到双向链表的最后
		     void linkLast(E e) {
		        final Node<E> l = last;
		        final Node<E> newNode = new Node<>(l, e, null);
		        last = newNode;
		        if (l == null)
		            first = newNode;
		        else
		            l.next = newNode;
		        size++;
		        modCount++;
		    }
		    remove()源码 删除第一个结点
		    1.执行
		    public E remove() {
		        return removeFirst();
		    }
		    2.执行
		    public E removeFirst() {
	        final Node<E> f = first;
	        if (f == null)
	            throw new NoSuchElementException();
	           return unlinkFirst(f);
	       }
	       3.执行unlinkFirst，将f指向的双向列表第一个结点拿掉
	       
	       private E unlinkFirst(Node<E> f) {
		        // assert f == first && f != null;
		        final E element = f.item;
		        final Node<E> next = f.next;
		        f.item = null;
		        f.next = null; // help GC
		        first = next;
		        if (next == null)
		            last = null;
		        else
		            next.prev = null;
		        size--;
		        modCount++;
		        return element;
		    }

		 */
	}
}
