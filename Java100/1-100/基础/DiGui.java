package lianxi;
//递归方法与循环
public class DiGui {
	public static void main(String args[]) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果：%s%n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("haoshi: %s%n",d2-d1);//耗时
		
	}
//	求阶乘的方法
	static long factorial(int n) {
		if(n==1) {
			return 1;
		
		}else {
			return n*factorial(n-1);
		}
	}

//	public  void hello(String args[]) {/*这里的方法*/
//		long d3 = System.currentTimeMillis();
//		int a = 10;
//		int result = 1;
//		while (a >1) {
//			result *=a *(a-1);
//			a -=2;
//		}
//		long d4 = System.currentTimeMillis();
//		System.out.println(result);
//		System.out.printf("普通费时：%s%n",d4 - d3);
//		
//	}/* 这是用循环来做的；总结就是递归尽量少用，费时间，用循环耗时为零。 */
}
