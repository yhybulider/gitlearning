package Scen;

public class Test {
	public static void main(String[] argsStrings) {//注意不要漏了，可以用代码补全去弄
		Book book = new Book("<Java从入门到精通>","明日科技",59.8);
		System.out.println("书名："+ book.getTitle());
		System.out.println("作者："+ book.getAuthor());
		System.out.println("价格："+ book.getPrice());
	}
	
	
}
