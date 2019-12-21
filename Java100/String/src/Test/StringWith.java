package Test;

public class StringWith {
	public static void main(String[] args) {
		String num1 ="25656";
		String num2 = "5656686";
		String ab = /* new */ (String) "fjij";
		
		boolean b1 = num1.startsWith("25");//判断字符串num1是否以25开头
		boolean b2 = num2.endsWith("86");//判断字符传num2是否以86结尾
		String AB = ab.toUpperCase();//将小写转换为大写，小写是s.toLowerCase()
		System.out.println(b2);
		System.out.println(b1);
		System.out.println(AB);
	}
}
