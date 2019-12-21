package Test;

public class Calculate {
	final float PI = /* (float) */ 3.14159F;
	public float getArea(float r) {
		float area = PI * r* r;
		return area;
		
	}
	
	public float getArea(float l,float w) {//重载getArea方法
		float area = l * w;
		return area;
	}
	public void draw(int num) {
		System.out.println("画"+num +"个任意形状的图形");
	}
	public void draw(String shape) {//重载draw的方法
		System.out.println("画一个"+shape);
	}
	public static void main(String[] args) {
		Calculate calculate = new Calculate();//去掉这一行就不可以，因为这是主方法，static型的，不能调用非静态的Calculate;
		float l =20;
		float w =30;
		float mianji =calculate.getArea(l,w);
		System.out.println("矩形面积是:"+mianji);
		float r = 7;
		float yuanmianji = calculate.getArea(r);
		System.out.println("圆的面积是："+yuanmianji);
		int num = 8;
		calculate.draw(num);
		calculate.draw("圆形");
	}
}