package Test;

public class DuiXiang {
	public static void main(String[] as) {
		Object obj = new String("暨南大学");
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str.charAt(0));
		}else if(obj instanceof StringBuffer) {
			StringBuffer str = (StringBuffer) obj;
			System.out.println(str.charAt(0));
		}
	}

}
