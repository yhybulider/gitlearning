import java.util.Scanner;
public class three{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("����Ҫת������Ϣ��");
		String password = in.nextLine();//��ȡ����
		char[] array = password.toCharArray();//�����toCharArray���������ַ���ת��Ϊһ���µ��ַ����顣��ȡ�ַ�����
		for(int i = 0;i < array.length;i++){//�����ַ�����
			array[i] = (char)(array[i] ^ 20000);//ÿһ������Ԫ�ؽ����������
		}
		System.out.println("���ܻ���ܽ������");
		System.out.println(new String(array));//�����Կ

	}
}