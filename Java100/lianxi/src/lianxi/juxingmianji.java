package lianxi;
import java.util.Scanner;
public class juxingmianji {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("宽：");
	double x = scan.nextDouble();
	System.out.println("长：");
	double y = scan.nextDouble();
	double juxingmianji = x * y;
	System.out.println("宽是：" +x);
	System.out.println("长是：" +y);
	System.out.println("mainji是：" +juxingmianji);
	
	}
}
