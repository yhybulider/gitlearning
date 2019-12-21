// 通过让Bird和Wolf继承Animal,从而允许他们两个获得Animal的方法，从而复用breath方法

class Animal{
	private void beat(){
		System.out.println("心脏跳动");
		
	}
	public void breath(){
		beat();
		System.out.println("呼吸中");
	}
}
//继承animal
class Bird extends Animal{
	public void fly(){
		System.out.println("鸟在空中飞");
	}
}
//继承animal，直接复用父类
class Wolf extends Animal{
	public void run(){
		System.out.println("在跑");
	}
}
public class test{
public static void main(String args[]){
	Bird b = new Bird();
	b.fly();
	b.breath();
	
}
}
