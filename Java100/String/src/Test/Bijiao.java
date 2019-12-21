package Test;
/*
 * 比较string与string builder操作时间的差别。
 */

public class Bijiao {
	public static void main(String[] args) {
		String str = "";
		long starTime = System.currentTimeMillis();
		for(long i = 0; i<100000;i++) {
			str = str+i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("string消耗时间："+time);
		StringBuilder builder = new StringBuilder("");
		starTime = System.currentTimeMillis();//开始时间
		for(long j = 0;j<100000;j++) {
			builder.append(j);
		}
		endTime = System.currentTimeMillis();//结束时间
		time = endTime - starTime;
		System.out.println("stringbuilder消耗时间："+time);
		String s1 = "int";//builder.insert(int offset,string str);加入字符
		String s2 = "ser";
		StringBuilder builder1 = new StringBuilder(s1);
		builder1.insert(2, s2);
		System.out.println("追加后builder的值是："+builder1);
//		StringBuilder builder4 = new StringBuilder("helloworld");
//		String s = builder.toString();
//		System.out.println("s="+s);
//		System.out.println("builder="+builder4);
	}

}
