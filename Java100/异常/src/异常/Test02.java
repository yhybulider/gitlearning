package 异常;
/*Java2的实用教程
 * 第七章异常类的例子
 * 7-28
 * 下午15：25
 */
public class Test02 {
	public static void main(String[] args) {
		int n= 0, m = 0, t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab89");//发生异常了，下面的t没办法被赋值
			t = 7777;
		}
		catch(NumberFormatException e) {
			System.out.println("发生异常："+e.getMessage());
		}
		System.out.println("n = "+ n +", m="+ m +",t ="+t );//打印出来的t不等于7777
		try {
			System.out.println("故意抛出I/O异常！");
			throw new java.io.IOException("我是故意的");//故意抛出异常
//			System.out.println();这个输出语句无法打印出来，所以要注释
		}
		catch(java.io.IOException e) {
			System.out.println("发生异常："+e.getMessage());
		}
	}

}
