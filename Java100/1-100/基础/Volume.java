package lianxi;
import java.util.Scanner;
public class Volume {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������뾶��");
		double r = scan.nextDouble();
		final double PI = 3.1415926;
		double volume = 4.0/3.0* PI * r * r * r;
		System.out.println("��İ뾶�ǣ�"+ r);
		System.out.println("Բ�����ǣ�"+ PI);
		System.out.println("���ε�����ǣ�"+ volume);
	}

}
