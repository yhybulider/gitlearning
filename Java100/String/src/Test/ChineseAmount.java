package Test;

import java.util.regex.Pattern;

public class ChineseAmount {
	public static void main(String[] args) {
		String text = "明日科技 soft";//获取用户输入
		int amount = 0;//创建汉字计数器
		for(int i = 0;i < text.length();i++) {//遍历字符串的每一个字符
			boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$",""+text.charAt(i));
			if(matches) {//如果是汉字就累加
				amount++;//累加器
			}
		}
		System.out.println("明日科技 soft中有几个汉字： " + amount+ "个");
	}

}
