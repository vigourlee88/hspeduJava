package com.hspedu.string_;

public class StringMethod2 {
	public static void main(String[] args) {
		
		//1.toUpperCase转换成大写
		String s = "hello";
		System.out.println(s.toUpperCase());
		//2.toLowerCase转换成小写
		System.out.println(s.toLowerCase());
		//3.concat拼接字符串
		String s1 = "宝玉";
		s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
		System.out.println(s1);
		//4.replace替换字符串中的字符
		String s3 = "宝玉 and 林黛玉 林黛玉 林黛玉";
		//s3.replace("林黛玉", "薛宝钗"),方法执行后，返回的结果才是替换过的
		//注意对s3没有任何影响
		String  s4 = s3.replace("林黛玉", "薛宝钗");
		System.out.println(s4);
		System.out.println(s3);
		//5.split 分割字符串，对于某些分隔字符，我们需要转义比如| \\字符
		String poem ="锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
		//以,标准进行分割，返回一个数组
		//对字符串进行分割时，如果有特殊字符，需要加入 转义符"\"
		String[] split = poem.split(",");
		
		poem = "E:\\aaa\\bbb";
		split = poem.split("\\\\");

		System.out.println("==分割后内容==");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		//6.toCharArray转换成字符串数组
		String ss ="happy";
		char[] chs =s.toCharArray();
		for (int i = 0; i < ss.length(); i++) {
			System.out.println(chs[i]);
		}
		//7.compareTo比较两个字符串的大小，
		//1.如果前者大，则返回整数，否则返回负数，相等，则返回0
		//2.如果长度相同，并且每个字符也相同，就返回0
		//如果长度相同或者不相同，但是在进行比较时，可以区分大小
		// 就返回if(c1 != c2){
		//         return c1-c2;
		//}
		//3.如果前面的部分都相同，就返回str.length-str2-length;
		
		String a ="jchn";
		String b ="jack";
		System.out.println(a.compareTo(b));//返回值'c'-'a'=2的值
		//8.格式化数组
		/*
		 * 占位符有
		 * %s 字符串
		 * %c 字符
		 * %d 整型 
		 * %.2f 浮点型
		 */
		String name = "john";
		int age = 10;
		double score = 56.897;
		char gender = '男';
		String info =
				"我的姓名是" + name 
				+ "年龄是" + age 
				+ ",成绩是"+ score 
				+ "性别是" + gender
				+ "。希望大家喜欢我!";
		System.out.println(info);
		
//		String info2 = String.format("我的姓名是%s年龄是d,成绩是%.2f性别是%c,希望大家喜欢我",name,age,score,gender);
		
		//1.%s, %d, %0.2f,%c都是占位符
		//2.这些占位符由后面的变量name,age,score,gender来替换
		//3.%s 表示后面由 字符串来替换
		//3.%d 表示后面由 整数来替换
		//3.%.2f 表示后面由 小数来替换，替换后只会保留小数点2位,并且进行四舍五入的处理
		//3.%c 表示使用 char类型来替换
		String formatStr = "我的姓名是%s,年龄是%d,成绩是%.2f,性别是%c,希望大家喜欢我!";
		String info2 = String.format(formatStr, name,age,score,gender);
		
		System.out.println("info2" + info2);		
		
	}
}
