package com.hspedu.interface_;

public class Computer {
	//编写一个方法,计算机工作
	//1.UsbInterface usbInterface 形参是接口类型 UsbInterface
	//2.看到 接收 实现了UsbInterface接口的类的对象实例usbInterface
	public void work(UsbInterface usbInterface) {
		//通过接口，来调用方法
		usbInterface.start();
		usbInterface.stop();
		
	}

}
