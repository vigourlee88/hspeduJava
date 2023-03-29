package com.hspedu.map_;

import java.util.HashMap;

@SuppressWarnings("all")
public class HashMapSource01 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("java", 10);
		map.put("php", 10);
		map.put("java", 20);
		
		System.out.println("map=" + map);
		
		/*
		 1.执行构造器new HashMap()
		 public HashMap() {
           this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
         }
		  初始化加载因子 loadfactor = 0.75
		  HashMap$Node[] table = null;
         2.执行put方法
		  public V put (K key, V value){
		      return putVal(hash(key),key,value,false,true);
		   }
		 会调用hash方法，计算key的hash值
		 static final int hash(Object key){
			 int h;
			 return (key == null) ? 0 :(h = key.hashCode()) ^ (h >>> 16);
		 }
		 
		 3.putVal()方法
		 final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
        //如果底层的table数组为null,或者length = 0，就扩容到16
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        //取出hash值对应的table的索引位置的Node,如果为null,就直接把加入的k-v
        //创建成一个Node,加入该位置即可
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;//辅助变量
            //如果该table的索引位置的key的hash值和新的key的hash值相同，
            //并且满足现在有的结点的key和准备添加的key是同一个对象，或者equals返回真
            if (p.hash == hash && 
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
                //如果当前的table已有的Node是红黑树，就按照红黑树的方式处理
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
            //如果找到的结点，后面是链表，就循环比较
                for (int binCount = 0; ; ++binCount) {//死循环
                    if ((e = p.next) == null) {//如果整个链表，没有和它相同的,就加到该链表的最后
                        p.next = newNode(hash, key, value, null);
                        //加入后，判断该链表的个数，是否已经到8个，到8个，后
                        //就调用treeifyBin方法进行 红黑树的转换
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash && //如果在循环比较过程中，发现有相同，就break,只是替换value
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;//替换，key对象的值
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;//每增加一个Node,就size++;
        if (++size > threshold)//临界值12->24->48,如果size>临界值，就扩容
            resize();
          afterNodeInsertion(evict);
           return null;
         }
         5.关于树化(转成红黑树)
         //如果table表为null,或者大小还没有到64，暂时不树化，而是进行扩容
         //否则才会真正的树化->剪枝
         final void treeifyBin(Node<K,V>[] tab,int hash){
         int n, index;Node<K,V> e;
         if(tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
         resize();
         }

		 */
	}
}
