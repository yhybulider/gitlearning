package lianxi;

public class This {
//	int id; //id
//	String name;//账户名
//	String pwd;//密码
//	public This() {
//		
//	}
//	public This(int id, String name) {
//		System.out.println("正在初始胡已经建好的对象："+this);
//		this.id = id;//不写this，无法区别局部变量id和成员变量id
//		this.name = name;
//	}
//	public void login() {
//		System.out.println(this.name+",要登录！");//不写this效果一样
//	}
	/*
	 * public static void main(String args[]) { This u3 = new This(101,"高小七");
	 * System.out.println("打印高小七对象："+u3); u3.login(); }
	 */
//	int x,y;
//	This(int x,int y){
//		this.x = x;
//		this.y = y;
//	}
//	public static void main(String args[]) {
//		This pt1,pt2;
//		pt1 = new This(3,3);
//		pt2 = new This(4,4);
//		System.out.print(pt1.x+pt2.x);
//	}
	int count = 9;
	public void count1() {
		count = 10;
		System.out.println("count1= "+count);
	}
	public void count2() {
		System.out.print("count2="+count);
		
	}
	public static void main(String args[]) {
		This t = new This();
		t.count1();
		t.count2();
		
	}
}
