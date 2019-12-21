package lianxi;
class Computer{//Java类
	String brand;
}
public class ClassLei {
	int id;
	String sname;
	int age;
	Computer comp;
	void study() {
		
		System.out.println("我正在学习！使用我们的电脑，"+comp.brand);
		System.out.println(sname);
	}
	ClassLei(){
		
	}
	public static void main(String args[]) {
		ClassLei stu1 = new ClassLei();
		stu1.sname = "张三";
		Computer comp1 = new Computer();
		comp1.brand = "联想";
		stu1.comp = comp1;
		stu1.study();
	}
}
