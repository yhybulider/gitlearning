package lianxi;
import java.util.Scanner;
public class YuanGongExample {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ա����������");
		String name = scan.nextLine();
		System.out.println("��������Ա��ӦƸ�ı�����ԣ�");
		String language = scan.nextLine();
		switch(language.hashCode()) {
			case 3254818://java�Ĺ�ϣ��
			case 2301506://Java
			case 2269730://JAVA
				System.out.println("Ա��"+ name+"�����䵽Java���򿪷����ţ�");
				break;
			case 3104://C
			case 2112://C#
				System.out.println("Ա��"+name+"�����䵽C#�����������");
				break;
			case -70910089://Asp.net�Ĺ�ϣ��
			case 955463181:
			case 974501:
				System.out.println("Ա��"+ name +"�����䵽ASP����");
				break;
			default:
				System.out.println("����˾����Ҫ"+language+"���Եĳ��򿪷���Ա��");
		}
		
		
	}

}
