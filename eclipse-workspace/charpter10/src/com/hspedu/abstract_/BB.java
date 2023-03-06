package com.hspedu.abstract_;

public class BB extends Template{
	
	@Override
	public void job() {//也去重写了父类Template的job方法
		
		int num = 0;
		for (int i = 1; i <= 80000; i++) {
			num *= i;
		}
	}
	
//	public void job2() {
//	//得到开始的时间
//		long start = System.currentTimeMillis();
//		int num = 0;
//		for (int i = 1; i <= 80000; i++) {
//			num *= i;
//		}
//		//得到结束的时间
//		long end = System.currentTimeMillis();
//		System.out.println("BB执行时间 " + (end - start));
//	}
}
