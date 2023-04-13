package com.hspedu.printstream_;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 演示PrintStream 字节打印流/输出流
 */
public class PrintStream_ {
	public static void main(String[] args) throws IOException {
		PrintStream out = System.out;
		//在默认情况下 PrintStream输出数据的位置是 标准输出 即显示器
		/*
		 *  public void print(String s) {
		 *     if(s== null){
		 *        s = "null";
		 *      }
         *    write(String.valueOf(s));
         *   }
		 */
		out.print("hello,john");
		//因为print底层使用的是write(),、
		//所以我们可以直接调用write进行打印
		
		out.write("韩顺平，你好".getBytes());//write(放入字节)
		out.close();
		
		//我们可以去修改打印输出的位置/设备
		//PrintStream构造器(File/String/OutputStream)
		//1.输出修改成到d:\\f1.txt
		//2."hello,韩顺平教育~" 就会输出到 d:\\f1.txt
		/*
		  public static void setOut(PrintStream out) {
             checkIO();
             setOut0(out);//native方法 修改了out
             //private static native void setOut0(PrintStream out);
           }
		 */
		System.setOut(new PrintStream("d:\\f1.txt"));
		System.out.println("hello,韩顺平教育~");
		
	}	
}
