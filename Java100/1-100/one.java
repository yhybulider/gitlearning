import java.util.Scanner;

public class one{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);//创建一个scanner对象，获取用户输入
		System.out.println("input a letter");
		char c = scan.next().charAt(0);
		if(c>='A'&&c<='Z'){
			c+=32;
			System.out.println("大写字母为: " + (char)(c-32) + " 变为: " + c);//先输出原来的再输出后面转换的
		}
		else if(c>='a'&&c<='z'){
			c-=32;
			System.out.println("小写字母为: " + (char)(c+32)+"变为:" +c);
		}
		else{
			System.out.println("false!input again");
		}
	}
}