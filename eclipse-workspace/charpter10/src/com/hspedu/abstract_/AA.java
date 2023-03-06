package com.hspedu.abstract_;

public class AA extends Template{
	
	
	
    //计算任务
	//1+2+....+10000
	@Override
	public void job() {//实现重写了父类Template的抽象方法job
		
		int num = 0;
		for (int i = 1; i <=200000; i++) {
			num += i;
		}	
	}
}
