import java.util.Scanner;
//有点类似之前遇到的面试题，给出指定的字符串，每次替换键盘输入的字符或者字母，主要用到scanner键盘输入，以及字符串的replaceAll方法，其实可以用replace代替，结果一样
public class seven{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	String str = "abcdgjdc";
	String B = scan.next();
	String A = str.replaceAll("cd",B);
	System.out.println(A);
}
}