package exercise;

public class main {

	public static void main(String[] args) {

		Book newBook = new Book(1, "Moby Dick", 950);
		System.out.println(newBook.getTitle());
		service.addToMap(newBook);
		
		newBook = new Book(2, "The meaning of life", 42);
		System.out.println(newBook.getTitle());
		service.addToMap(newBook);

		service.deleteFromMap("Moby Dick");
	}

}
