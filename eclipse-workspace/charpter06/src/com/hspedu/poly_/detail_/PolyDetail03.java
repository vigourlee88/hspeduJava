package com.hspedu.poly_.detail_;

public class PolyDetail03 {
	public static void main(String[] args) {
		// instanceof 比较操作符
        //用于判断对象的 运行类型 是否为xx类型或者xx类型的子类
		BB bb = new BB();
		System.out.println(bb instanceof BB);//true
		System.out.println(bb instanceof AA);//true
		
		//aa 编译类型 AA，运行类型BB
		AA aa = new BB();
		System.out.println(aa instanceof BB);//true
		System.out.println(aa instanceof AA);//true
		
		Object obj = new Object();
		System.out.println(obj instanceof AA);
		//obj 运行类型是Object,Object不是AA类型或AA的子类  false
		
		String str = "hello";
		//System.out.println(str instanceof AA);错误
		System.out.println(str instanceof Object);//true
		
	}

}

class AA{
	
}
class BB extends AA{
	
}