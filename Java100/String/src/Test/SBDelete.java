package Test;
/*
 * 删除字符串中重复的字符
 * 142页
 */
public class SBDelete {
	public static void main(String[] args) {
		String s = "命运如同海风一吹着青春的舟、飘摇的、曲折的、渡过了时间的海！";
		StringBuilder sb = new StringBuilder(s);
		System.out.println("原来的字符是："+sb);
		System.out.println("原来的字符串长度是："+sb.length());
		for(int i = 0;i<sb.length();i++) {
			for(int j = i+1;j<sb.length();j++) {//比较后面的字符，如果和前一个相同的就删掉
			if(sb.charAt(i) == sb.charAt(j)){//charAt（）加上索引值可以表示字符串的值。
				sb.deleteCharAt(j);
				}
			}
		}
		System.out.println("现在的字符串是："+sb);//输出新字符串
		System.out.println("现在的字符串长度是："+sb.length());//输出新字符字符串长度
	}
}
