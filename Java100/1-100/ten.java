//static的实际应用
class Book{
	private static int num = 0//保存了统计个数，意思下面的主方法调用一次，都会保留一次
	public Book(){//只要是新对象实例化就会执行该构造
		num++;//保持自增
		System.out.println("这是第"+ num + "个产生的对象！");
	//输出
	}
}
public class test{
	public static void main(String args[]){
		new Book();new Book();
		new Book();
	}
}


/* 输出结果：这是第1个产生的对象！
这是第2个产生的对象！
这是第3个产生的对象！ */