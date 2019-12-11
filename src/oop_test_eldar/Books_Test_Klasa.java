package oop_test_eldar;

public class Books_Test_Klasa {

	public static void main(String[] args) {
		
		
		Author author1 = new Author("Ivo Andric", "ivo.andric@gmail.com", 'M');
		Book book1 = new Book("Na drini cuprija", author1, 10.0, 15);
		
		System.out.println(book1.toString());
		
		
		
	}

}
