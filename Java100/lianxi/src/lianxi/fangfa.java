package lianxi;

public class fangfa {
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 20;
		int sum = add(num1,num2);
		System.out.println("sum = "+ sum);
		print();
	}
	public static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
		
	}
	public static void print() {
		System.out.println("北京飒回复");
	}

}
