package com.hspedu.map_;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

@SuppressWarnings("all")
public class TreeMap_ {
	public static void main(String[] args) {
		
		//使用默认的构造器，创建TreeMap 是无序的，没有排序
		//TreeMap treeMap = new TreeMap();
		TreeMap treeMap = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//按照传入的k(String)的大小进行排序
				//按照K(String)的长度大小排序
				//return ((String) o2).compareTo((String) o1);
				return ((String) o2).length() - ((String) o1).length();
			}
			
		});
		
		treeMap.put("jack", "杰克");
		treeMap.put("tom", "汤姆");
		treeMap.put("kristina", "克瑞斯替诺");
		treeMap.put("smith", "史密斯");
		treeMap.put("hsp","韩顺平");//使用compare比较字符串大小的话，加入不了
		
		System.out.println("treemap=" + treeMap);
		
		/*源码解读
		 * 1.构造器 把传入的实现了Comparator接口的匿名内部类(本质是对象)
		 *  传给了TreeMap的comparator属性
		 * public TreeMap(Comparator<? super K> comparator) {
		 * 将匿名内部类赋给TreeMap的一个属性
              this.comparator = comparator;
          }
          2.调用put方法
		    private V put(K key, V value, boolean replaceOld) {
		    2.1第一次添加 ，把k-v 封装到Entry对象中，放入root中 
		        Entry<K,V> t = root;
		        
		        if (t == null) {
		            addEntryToEmptyMap(key, value);
		            return null;
		        }
		         private void addEntryToEmptyMap(K key, V value) {
			        compare(key, key); // type (and possibly null) check
			        root = new Entry<>(key, value, null);
			        size = 1;
			        modCount++;
			    }
			    int cmp;
		        Entry<K,V> parent;
			    
			    2.2以后添加
		        
		        // split comparator and comparable paths
		        Comparator<? super K> cpr = comparator;
		        if (cpr != null) {//遍历所有的key,给当前的key找到适当的位置
		            do {
		                parent = t;
		                //动态绑定，到我们的匿名内部类的compare
		                //return ((String) o2).length() - ((String) o1).length();
		                cmp = cpr.compare(key, t.key);
		                if (cmp < 0)
		                    t = t.left;
		                else if (cmp > 0)
		                    t = t.right;
		                else {//如果遍历过程中，发现准备添加的key和当前已有的key相等，就不添加，直接返回
		                    V oldValue = t.value;
		                    if (replaceOld || oldValue == null) {
		                        t.value = value;
		                    }
		                    return oldValue;
		                }
		            } while (t != null);
		        } 
		 */
	}
}
