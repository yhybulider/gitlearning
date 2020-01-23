package lianxi;
import java.util.Scanner;//声明包scanner用来接收用户的输入
public class LeapYear {//声明类
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);//扫描器
		System.out.println("请输入一个年份：");
		long year = scan.nextLong();//接受用户输入
		if(year %4 == 0&& year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "年是闰年！");//{}是java的特色，看清{}的结构，也是读懂代码的关键
		}else {
			System.out.println(year + "年不是闰年！");
		}
	}

}

/*import java.util.Scanner;
如果要输入 int 或 float 类型的数据，在 Scanner 类中也有支持，
但是在输入之前最好先使用 hasNextXxx() 方法进行验证，再使用 nextXxx() 来读取：
public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
 
        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }
}*/