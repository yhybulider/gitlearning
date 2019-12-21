package shuzu;

public class Test {
	public static void main(String[] args) {
		int[] num = {5,61,2,3,4,7,8,9,10};
//		int sum = 0;
//		System.out.println("一维数组元素的和为：");
//		for(int i =0;i<10;i++) {
//			if(i == 9) {
//				System.out.print(num[i] + "=");下标是9时，也就是第十个数时候，就输出等于号
//			}else {
//				System.out.print(num[i] + "+");
//			}
//			sum = sum + num[i];进行累加
//		}
//		System.out.println(sum);输出和，最后的结果
		System.out.println("输出一维数组：");
		for(int i = 0;i <num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int min = num[0];
		for (int j =0;j<num.length-1;j++) {
			if(min > num[j+1]) {//比较哪个更小，然后选择哪个
				min = num[j+1];
			}
		}
		System.out.println("\n 一维数组的最小值是："+min);//输出数组的最小值

	}
}