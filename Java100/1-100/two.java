import java.util.Scanner;
public class two{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("����һ��������");
		long number = scan.nextLong();
		String check = (number % 2 ==0)?"��������ǣ�ż��":"��������ǣ�����";//��Ԫ�������b=a<0?-a:a;
		System.out.println(check);
	}
}