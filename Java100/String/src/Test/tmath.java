package Test;

import java.util.Random;

/*7-27
 * 对math类的一些用法，重点在随机数
 * 网址在：https://www.sxt.cn/Java_jQuery_in_action/eight-math.html
 */
public class tmath {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextDouble());//double范围内的数
		System.out.println(rand.nextInt());//int范围内的数
		System.out.println(rand.nextFloat());//0-1
		System.out.println(rand.nextBoolean());//对与错
		System.out.println(rand.nextInt(10));//0-10的数
	}

}
