package com.hspedu.outputstream_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//使用BufferedOutputStream和BufferedInputStream
//使用他们完成 二进制文件拷贝 或也可以文本文件 (底层一个汉字 对应3个字节)
public class BufferedCopy02 {
	public static void main(String[] args) {
		String srcFilePath = "d:\\pg.png";
		String destFilePath= "d:\\pg2.png";
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//因为FileInputStream是InputStream 的子类
			bis = new BufferedInputStream(new FileInputStream(srcFilePath));
			bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
			
			//循环读取文件 并写入到destFilePath
			byte[] buff = new byte[1024];
			int readLen = 0;
			//readLen = bis.read(buff)返回读取数据的长度，当返回-1时，表示读取完毕
			while((readLen = bis.read(buff)) != -1) {
				bos.write(buff,0,readLen);
			}
			System.out.println("文件拷贝完毕~~");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//关闭流,外层处理流即可
			try {
				if(bos != null) {
					bos.close();
				}
				if(bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
