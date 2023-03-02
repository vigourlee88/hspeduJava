package com.hspedu.poly_.polyparameter_;

public class PloyParameter {
	public static void main(String[] args) {
		//方法定义的形参类型为父类类型，实参类型允许为子类类型
		
		Worker tom = new Worker("tom",2500);
		Manager milan = new Manager("milan",5000,200000);
		PloyParameter polyParameter = new PloyParameter();
		polyParameter.showEmpAnnual(tom);
		polyParameter.showEmpAnnual(milan);
		
		
		polyParameter.testWork(tom);
		polyParameter.testWork(milan);
		
	}
	
	
	//showEmpAnnual(Emplyee e)
	//实现获取任何员工对象的年工薪，并在main方法中调用该方法e.getAnnual()
    public void showEmpAnnual(Employee e) {
    	System.out.println(e.getAnnual());//动态绑定，传递过来什么参数(员工)会调用对应员工的方法
    }
    
    //添加一个方法，testWork,
  	//如果是普通员工，则调用work方法
  	//如果是经理就调用manage方法
  	public void testWork(Employee e) {
  		//对象的运行类型是否是XX类型或XX类型的子类
  		if(e instanceof Worker) {
  			((Worker) e).work();//向下转型操作
  		}else if(e instanceof Manager) {
  			((Manager) e).manage();
  		}else {
  			System.out.println("不作处理");
  		}
  	}
}
