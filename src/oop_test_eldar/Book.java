package oop_test_eldar;

public class Book {
		private String name;
		private Author author;
		private double price;
		private int qtyInStock;
	
	public Book (String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	public String toString() {
		Author autor = this.getAuthor();
		return ("Book name: " + this.getName() + ". Book author: " + autor.getName() + ". Book price: " + this.getPrice() + ". Available books: " + this.getQtyInStock());
	}
	
	
	
	
	
	
}
