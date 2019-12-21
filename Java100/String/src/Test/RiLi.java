package Test;

import java.util.*;
public class RiLi {
	//calendar类是一个抽象类，有着日期相关的功能，比如年月日时等
	//GregorianCalendar是一个具体的子类，提供了世界上大多数国家/地区使用的标准日历系统
	    public static void main(String[] args) {
	        // 得到相关日期元素
	        GregorianCalendar  calendar= new GregorianCalendar(2999, 10, 9, 22, 10, 50);
	        int year = calendar.get(Calendar.YEAR); // 打印：2999
	        int month = calendar.get(Calendar.MONTH); // 打印：10
	        int day = calendar.get(Calendar.DAY_OF_MONTH); // 打印：9
	        int day2 = calendar.get(Calendar.DATE); // 打印：9
	        // 日：Calendar.DATE和Calendar.DAY_OF_MONTH同义
	        int date = calendar.get(Calendar.DAY_OF_WEEK); // 打印：
	        // 星期几 这里是：1-7.周日是1，周一是2，。。。周六是7（这个码今天是周六）
	        System.out.println(year);
	        System.out.println(month);
	        System.out.println(day);
	        System.out.println(day2);
	        System.out.println(date);
	        // 设置日期
	        GregorianCalendar calendar2 = new GregorianCalendar();
	        calendar2.set(Calendar.YEAR, 2999);
	        calendar2.set(Calendar.MONTH, Calendar.FEBRUARY); // 月份数：0-11
	        calendar2.set(Calendar.DATE, 3);
	        calendar2.set(Calendar.HOUR_OF_DAY, 10);
	        calendar2.set(Calendar.MINUTE, 20);
	        calendar2.set(Calendar.SECOND, 23);
	        printCalendar(calendar2);
	        // 日期计算
	        GregorianCalendar calendar3 = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
	        calendar3.add(Calendar.MONTH, -7); // 月份减7
	        calendar3.add(Calendar.DATE, 7); // 增加7天
	        printCalendar(calendar3);
	        // 日历对象和时间对象转化
	        Date d = calendar3.getTime();
	        GregorianCalendar calendar4 = new GregorianCalendar();
	        calendar4.setTime(new Date());
	        long g = System.currentTimeMillis();
	    }
	    static void printCalendar(Calendar calendar) {
	        int year = calendar.get(Calendar.YEAR);
	        int month = calendar.get(Calendar.MONTH) + 1;
	        int day = calendar.get(Calendar.DAY_OF_MONTH);
	        int date = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 星期几
	        String week = "" + ((date == 0) ? "日" : date);
	        int hour = calendar.get(Calendar.HOUR);
	        int minute = calendar.get(Calendar.MINUTE);
	        int second = calendar.get(Calendar.SECOND);
	        System.out.printf("%d年%d月%d日,星期%s %d:%d:%d\n", year, month, day,  
	                        week, hour, minute, second);
	    }
}

