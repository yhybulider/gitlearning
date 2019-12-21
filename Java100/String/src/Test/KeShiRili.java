package Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class KeShiRili {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入日期（格式为：2010-3-3）");
		Scanner scanner =  new Scanner(System.in);
		String dateString = scanner.nextLine();
		//将输入的字符串转化为日期类
		System.out.println("你放输入的日期是："+dateString);
		String[] str = dateString.split("-");//提出年月日
		int year = Integer.parseInt(str[0]);
		int month = new Integer(str[1]);
		int day = new Integer(str[2]);
		Calendar c = new GregorianCalendar(year,month - 1,day);
		c.set(Calendar.DATE,1);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 0;i< dow -1;i++) {
			System.out.print("\t");//数到第七条后开始换行，即一周为一个循环。
		}
		int maxDate = c.getActualMaximum(Calendar.DATE);
//		System.out.println("maxDate:"+maxDate);打印出该月的最大日期
		for(int i = 1; i <= maxDate; i++) {
			StringBuilder sBuilder = new StringBuilder();
				if(c.get(Calendar.DATE) ==day) {
					sBuilder.append(c.get(Calendar.DATE) + "\t");
					
				}else {
					sBuilder.append(c.get(Calendar.DATE)+ "\t");
				}
//				System.out.print(sBuilder);

				System.out.print(c.get(Calendar.DATE)+
			                          ((c.get(Calendar.DATE)==day)?"*":"")+"\t");//也将对应的时间给用*标注出来，方便查看
				if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					System.out.print("\n");
				}
				c.add(Calendar.DATE, 1);
			}		
			
		
	}

}
