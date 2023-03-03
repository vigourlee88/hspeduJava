package com.hspedu.houserent.utils;

import java.util.Scanner;

/**
  工具类的作用:
  处理各种情况的用户输入，并且能够按照程序员的需求，得到用户的控制台输入
 
 */
public class Utility {
	//静态属性...
	private static Scanner scanner = new Scanner(System.in);
	/**
	 * 功能 读取键盘输入的一个菜单选项，值1-5的范围
	 * @return 1-5
	 */
	public static char readMenuSelection() {
		char c;
		for(; ; ) {
			String str = readKeyBoard(1,false);//包括一个字符的字符串
			c = str.charAt(0);//将字符串转换成字符char类型
			if(c != '1' && c != '2' &&
			   c != '3' && c != '4' &&	c != '5') {
				System.out.println("选择错误，请重新输入");
			}else break;
		}
		return c;
	
	}
	/**
	 * 功能 读取键盘输入的一个字符
	 * @return 一个字符
	 */
	
	public static char readChar() {
		String str = readKeyBoard(1,false);//就是一个字符
		return str.charAt(0);
	}
	/**
	 * 功能 读取键盘输入的一个字符，如果直接按回车，则返回指定的默认值，否则返回输入的字符
	 * @param defaultValue 指定的默认值
	 * @return  默认值或输入的字符
	 */
	public static char readChar(char defaultValue) {
		String str = readKeyBoard(1,true);//要么是空字符串
		return (str.length() == 0)? defaultValue :str.charAt(0);//要么是空字符串，要么是一个字符
	}
	/**
	 * 功能 读取键盘输入的整型，长度小于2位
	 * @return 整数
	 */
	public static int readInt() {
		int n;
		for(; ; ) {
			String str = readKeyBoard(10,false);//一个整数，长度<=10位
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.println("数字输入错误,请重新输入");
			}
		}
		return n;
	}
	/**
	 * 功能 读取键盘输入的整数或默认值，如果直接按回车，则返回指定的默认值，否则返回输入的整数
	 * @param defaultValue 指定的默认值
	 * @return 默认值或整数
	 */
	public static int readInt(int defaultValue) {
		int n;
		for(; ; ) {
			String str = readKeyBoard(10,true);
			if(str.equals("")) {
				return defaultValue;
			}
			
			//异常处理
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.println("数字输入错误，请重新输入: ");
				
			}
		}
		return n;
	}
	/**
	 * 功能 读取键盘输入的指定长度的字符串
	 * @param limit 限制的长度
	 * @return 指定长度的字符串
	 */
	public static String readString(int limit) {
		return readKeyBoard(limit,false);
	}
		/**
		 *功能 读取键盘输入的指定长度的字符串或默认值，如果直接直接回车，返回默认值，否则返回字符串
		 *@param limit 限制的长度
		 *@param defaultValue 指定的默认值
	     *@return 指定长度的字符串 
		 */
		public static String readString(int limit,String defaultValue) {
			String str = readKeyBoard(limit,true);
			return str.equals("")? defaultValue : str;
		}
		/**
		 * 功能 读取键盘输入的确认选项，Y或N
		 * 将小的功能，封装到一个方法中，
		 * @return Y或N
		 * 
		 */
		public static char readConfirmSelection() {
			System.out.println("请输入你的选择(Y/N)");
			char c;
			for(; ; ) {
				//将接收到的字符，转换成大写字母
				String str = readKeyBoard(1,false).toUpperCase();
				c = str.charAt(0);
				if(c == 'Y' || c == 'N') {
					break;//退出for循环
				}else {
					System.out.print("选择错误，请重新输入: ");
				}
			}
			return c;
		}
		public static String readKeyBoard(int limit,boolean blankReturn) {
			
			//定义了字符串
			String line ="";
			
			//scanner.hasNextLine()判断有没有下一行
			while(scanner.hasNextLine()) {
				line = scanner.nextLine();//读取这一行
				
				//如果line.length=0,即用户没有输入任何内容，直接回车
				if(line.length() == 0) {
					if(blankReturn) //如果blankReturn是true,就返回空串
					return line;
					else 
					continue;//如果blankReturn是false,不接受空串，必须输入内容		
				}
				
				//如果用户输入的内容大于了limit,就提示重写输入
				//如果用户输入的内容>0  <= limit 就接受
				if(line.length() < 1 || line.length() > limit) {
					System.out.print("输入长度(不能大于" + limit + ")错误,请重新输入: ");
					continue;
				}
				break;
			}
			return line;
		}
}
