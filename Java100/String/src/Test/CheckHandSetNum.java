package Test;
/*
 * 书上的p134
 * 在主方法中创建String对象，使用正则表达式对手机号码的合法性进行验证。
 */

public class CheckHandSetNum {
	public static void main(String[] args) {
		String telephone1 = "26554545455";//定义要验证的电话号码
		String telephone2 = "13578961234";
		System.out.println(check(telephone1));
		System.out.println(check(telephone2));
	}
	public static String check(String handst) {
		String regex = "1[3,5,8]\\d{9}$";//表示是前两位是13、15、18，后面9位是0-9中的任意数。
				if(handst.matches(regex)) {//判断是否符合
					return handst +"\n是合法的手机号";
				}else {
					return handst +"\n不是合法的手机号";
				}
	}

}
