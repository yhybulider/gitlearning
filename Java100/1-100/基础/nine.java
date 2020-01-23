/* date：12/11
这个代码是记录引用传递的 */
public class test{
	public static void main(String args[]){
		String msg = "hello";//定义string类，字符串内容不可改变
		fun(msg);//引用传递
		System.out.println(msg);//输出
	
	}
	
	public static void fun(String  tmp){//接受字符串引用
		tmp = "world";//改变字符串引用
	}
}
/* 这里的string会产生垃圾空间，这里的fun方法不会改变msg的内容，最终结果不变。 */