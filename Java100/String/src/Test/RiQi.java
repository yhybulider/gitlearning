package Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class RiQi {
	/*
	 * public static void main(String[] args) { Date date1 = new Date();
	 * System.out.println(date1.toString()); long i = date1.getTime();//定义为long型
	 * Date date2 = new Date(i-1000);//毫秒为基本单位 Date date3 = new
	 * Date(i+1000);//当前的日期前进或后退 System.out.println(date1.after(date2));
	 * System.out.println(date1.before(date2));
	 * System.out.println(date1.equals(date2));//=
	 * System.out.println(date1.after(date3));
	 * System.out.println(date1.before(date3));
	 * System.out.println(date1.equals(date3)); System.out.println(new Date(1000L *
	 * 60 *60*24 *365*39L).toString());//输出的格式 }
	 */
public static void main(String[] args) throws ParseException {
	//不同的格式，按照写进去的格式打出来不一样的时间格式
	SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	SimpleDateFormat s2 = new SimpleDateFormat("D");//获取一年中的当前的天数
	String daytime = s1.format(new Date());
	System.out.println(daytime);
	System.out.println(s2.format(new Date()));
	System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
	String time = "2019-7-27";
	Date date = s2.parse(time);
	System.out.println("date1:"+date);
	time = "2019-7-27 14:54:48 ";
	date = s1.parse(time);
	System.out.println("date2:"+date); 
	}
}



