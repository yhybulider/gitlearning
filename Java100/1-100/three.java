import java.util.Scanner;
public class three{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("输入要转换的信息：");
		String password = in.nextLine();//获取输入
		char[] array = password.toCharArray();//这里的toCharArray方法将此字符串转换为一个新的字符数组。获取字符数组
		for(int i = 0;i < array.length;i++){//遍历字符数组
			array[i] = (char)(array[i] ^ 20000);//每一个数组元素进行异或运算
		}
		System.out.println("加密或解密结果如下");
		System.out.println(new String(array));//输出秘钥

	}
}