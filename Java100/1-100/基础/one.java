import java.util.Scanner;

public class one{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);//����һ��scanner���󣬻�ȡ�û�����
		System.out.println("input a letter");
		char c = scan.next().charAt(0);
		if(c>='A'&&c<='Z'){
			c+=32;
			System.out.println("��д��ĸΪ: " + (char)(c-32) + " ��Ϊ: " + c);//�����ԭ�������������ת����
		}
		else if(c>='a'&&c<='z'){
			c-=32;
			System.out.println("Сд��ĸΪ: " + (char)(c+32)+"��Ϊ:" +c);
		}
		else{
			System.out.println("false!input again");
		}
	}
}