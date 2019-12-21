package lianxi;

public class For {
	public static void main(String args[]){
		int sum = 0;
		for(int i = 2;i<=100;i+=2) {//for的格式，记得是初始值，范围，到操作表达式。
			sum = sum+i;
		}
	System.out.println("2到100之间的所有偶数之和为；"+sum);
		
	}
}
