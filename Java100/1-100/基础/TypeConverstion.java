package lianxi;
//һ����Ū��project
public class TypeConverstion {//���Ƕ���class
	public static void main(String args[]){//������
//String args[] = String[]args
	int intNum = 4;
	float floatNum = 9.5F;
	
	floatNum /=intNum;//ת����float��
	System.out.println("9.5F����4�����ǣ�"+floatNum);
	double numX = 4.88;
	double numY = 78.83;
	int numZ = (int)numX +(int)numY;//��double��ת����int��
	System.out.println("���ַ�Tת����int�ͱ����ǣ�"+numZ);
	
	char charVar = 'T';
	int intVar = (int)charVar;//��char��ת��Ϊint��
	System.out.println("���ַ�Tת����int�ͱ����ǣ�"+intVar);
	
	int num1 = 34;
	double num2 = (double)num1/3;//��int��ת����double��
	System.out.println("34������֮һ��"+num2);
	}

}
