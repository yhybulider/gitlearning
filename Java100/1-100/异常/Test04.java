package 异常;
/*7-29
 * 测试，空指针的时候运行时候会报错，编译没问题
 * null表示i没有指向任何对象的实体，但作为对象名称是合法的(不管这个对象名称存是否指向了某个对象的实体)。由于实际上i并没有指向任何对象的实体，
 * 所以也就不可能操作intValue()方法，这样上面的写法在运行时就会出现NullPointerException错误。
 */

public class Test04 {
public static void main(String[] args) {
	try {
		Integer i = null;
		int j = i;
	}
	catch(Exception e) {
			System.out.println("错误是：" + e.getMessage());
	}
	System.out.println("ahfh");
}
}
