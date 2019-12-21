package Test;
/*
 * 验证ip地址是否合法
 * 书上136页
 */
public class CheckIPAddress {
	public static void main(String[] args) {
		String ip = "119.168.1.1";
		System.out.println(matches(ip));
	}
	public static String matches(String text) {
		if(text!=null&&!text.isEmpty()) {//定义正则表达式
			String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[0-9]\\d|[1-9])\\."//|表示是或
					+ "^(1\\d{2}|2[0-4]\\d|25[0-5]|[0-9]\\d|\\d)\\."
					+"^(1\\d{2}|2[0-4]\\d|25[0-5]|[0-9]\\d|\\d)\\."
					+"^(1\\d{2}|2[0-4]\\d|25[0-5]|[0-9]\\d|\\d)$";
			if(text.matches(regex)) {
				return text +"\n 是一个合法的IP地址！";
			}else {
			return text +"\n 不是一个合法的IP地址！";
		}
	}
	return "请输入要验证的IP地址！";
 }
}
