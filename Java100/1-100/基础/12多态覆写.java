class A{
	public void print(){
		System.out.println("A,public void print(){}");
		
	}
}

// 覆写父类的print的方法，这样输出就可以是B的了

class B extends A{
// class B{ 和普通定义的类是一样的效果
	public void print(){
		System.out.println("B,public void print(){}");    //3
	}
}

public class test{
	public static void main(String args[]){
		// B b =new B();  //实例化的是子类的对象   1
		A b = new B();//实例化的是子类的对象,对象向上转型   2
		b.print();    //调用的是被子类复写的方法
		
	}
}

// 1和2的输出结果是一样的  都是3