package lianxi;
import java.util.Scanner;//������scanner���������û�������
public class LeapYear {//������
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);//ɨ����
		System.out.println("������һ����ݣ�");
		long year = scan.nextLong();//�����û�����
		if(year %4 == 0&& year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "�������꣡");//{}��java����ɫ������{}�Ľṹ��Ҳ�Ƕ�������Ĺؼ�
		}else {
			System.out.println(year + "�겻�����꣡");
		}
	}

}

/*import java.util.Scanner;
���Ҫ���� int �� float ���͵����ݣ��� Scanner ����Ҳ��֧�֣�
����������֮ǰ�����ʹ�� hasNextXxx() ����������֤����ʹ�� nextXxx() ����ȡ��
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // �Ӽ��̽�������
 
        // nextLine��ʽ�����ַ���
        System.out.println("nextLine��ʽ���գ�");
        // �ж��Ƿ�������
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("���������Ϊ��" + str2);
        }
        scan.close();
    }
}*/