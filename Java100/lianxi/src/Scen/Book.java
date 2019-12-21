package Scen;
//自定义图书类
public class Book {
	private String title;
	private String author;
	private double price;
	public Book (String title,String author,double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return this.title;
		
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	

}

