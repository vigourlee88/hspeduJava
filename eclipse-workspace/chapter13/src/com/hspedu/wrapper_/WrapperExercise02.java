package com.hspedu.wrapper_;


public class WrapperExercise02 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i ==j);//false 两个对象比较
		
		//这里主要看范围赋值-128~127,就是直接返回
		/*源码
	    @IntrinsicCandidate
	    public static Integer valueOf(int i) {
	        if (i >= IntegerCache.low && i <= IntegerCache.high)
	            return IntegerCache.cache[i + (-IntegerCache.low)];
	        return new Integer(i);
	    }
		 */	
		
		Integer m = 1;//底层赋值Integer.valueOf(1)看源码
		Integer n = 1;//底层赋值Integer.valueOf(1)看源码 
		System.out.println(m == n);//true
		
		//这里主要看范围赋值-128~127,就是直接返回
		//否则就new Integer(xx)
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
		
	}
}
