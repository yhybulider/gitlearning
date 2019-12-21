package Test;
/*
 * 将汉字和字母转换成unicode码
 */
public class CharacterUnicode {
	public static void main(String[] args) {
		String text = "明日 soft";
		char[]charArray = text.toCharArray();
		StringBuilder builder = new StringBuilder();
		for(char c: charArray) {
			builder.append((int)c+" ");
		}
		System.out.println("“明 日 科 技”的 Unicode码是：");//这里套的引号很容易搞错，两个英文的引用号不能一起用。
		System.out.println(builder.toString());
	}

}
