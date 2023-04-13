package com.hspedu.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
	public static void main(String[] args) {
	
		String filePath = "d:\\note.txt";
		//创建FileWriter对象
		FileWriter fileWriter = null;
		char[] chars = {'a','b','c'};
		
		try {
			fileWriter = new FileWriter(filePath);//目前默认是覆盖写入
			//write(int); 写入单个字符
			fileWriter.write('H');
			//write(char[]); 写入指定数组
			fileWriter.write(chars);
			//write(char[],0,len); 写入指定数组的指定部分
			fileWriter.write("韩顺平教育".toCharArray(),0,3);//toCharArray()将此字符串转换为新的字符数组。 
			//write(String); 写入整个字符串
			fileWriter.write(" 你好北京~");
			fileWriter.write("风雨过后，定见彩虹");
			//write(String,off,len);写入字符串的指定部分 
			fileWriter.write("上海天津 ",0,2);//上海
			//在数据量大的情况下，可以使用循环操作
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//对应FileWriter,一定要关闭流，或者flush才能真正的把数据写入到文件
			/*
			 * private void writeBytes() throws IOException {
			 *  this.bb.flip();
			 *  int var1 = this.bb.limit();
			 *  int var2 = this.bb.position();
			 *  
			 *  assert var2 <= varl;
			 *  
			 *  int var3 = var2 <= var1 ? var1 -var2 : 0;
			 *  
			 *  if (var3 > 0){
			 *   if(this.ch != null){
			 *     assert this.ch.write(this.bb) == var3:var3;
			 *   }else{
			 *     this.out.write(this.bb.array(),this.bb.arrayOffset() + var2,var3);
			 *     }
			 *    }
			 *    this.bb.clear();
			 *    }
			 */
			try {
				//fileWriter.flush();
				//关闭文件流，等价flush() + 关闭
				fileWriter.close();
			} catch (IOException e) {
			 
				e.printStackTrace();
			}
		}
		System.out.println("程序结束");
	}
}
