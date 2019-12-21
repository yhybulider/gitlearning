import java.util.Scanner;
public class two{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个整数：");
		long number = scan.nextLong();
		String check = (number % 2 ==0)?"这个数字是：偶数":"这个数字是：奇数";//三元运算符：b=a<0?-a:a;
		System.out.println(check);
	}
}