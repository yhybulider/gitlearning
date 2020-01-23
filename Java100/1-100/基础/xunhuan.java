 package lianxi;

public class xunhuan {
	public static void main(String args[]){
		int a = 100;
		while(a > 60)//����ѭ��
		{
			a--;
			if(a == 60) {
				System.out.println("ok! a == 60");
			}
		}
		int b = 100;//�ܴ�Ļ�������������1 of 2 branches missed�����ݴ�����������61�������������
		do
		{
			System.out.println("ok! b == 100");
			b--;
		}
		while(b == 60);//ָ��ѭ���������
	}

}
