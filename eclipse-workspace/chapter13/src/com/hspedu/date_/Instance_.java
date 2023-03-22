package com.hspedu.date_;

import java.time.Instant;
import java.util.Date;

public class Instance_ {
	public static void main(String[] args) {
		//1.通过 静态方法now()获取表示当前时间戳的对象
		Instant now = Instant.now();
		System.out.println(now);
		//2.通过from 可以把Instant 转成Date
		Date date = Date.from(now);
		//3.通过date的toInstant可以把date转成Instant对象
		Instant instant = date.toInstant();
	}
}
