package lianxi;
//一定得弄个project
public class TypeConverstion {//这是定义class
	public static void main(String args[]){//主方法
//String args[] = String[]args
	int intNum = 4;
	float floatNum = 9.5F;
	
	floatNum /=intNum;//转换成float型
	System.out.println("9.5F处以4的商是："+floatNum);
	double numX = 4.88;
	double numY = 78.83;
	int numZ = (int)numX +(int)numY;//将double型转换成int型
	System.out.println("将字符T转换成int型变量是："+numZ);
	
	char charVar = 'T';
	int intVar = (int)charVar;//将char型转换为int型
	System.out.println("将字符T转化成int型变量是："+intVar);
	
	int num1 = 34;
	double num2 = (double)num1/3;//将int型转换成double型
	System.out.println("34的三分之一："+num2);
	}

}
