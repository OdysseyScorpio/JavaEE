package exercise;

import java.util.HashMap;
import java.util.Map;

public class service {
	static Map<String, Book> bookStore = new HashMap<>();

	public static void addToMap(Book book) {
		bookStore.put(book.getTitle(), book);
		System.out.println("Adding");
		System.out.println(	bookStore.get(book.getTitle()).getTitle() + "|" + bookStore.get(book.getTitle()).getNumberOfPages());
	}

	public static void deleteFromMap(String title) {
		System.out.println("Removing");
		System.out.println(bookStore.get(bookStore.get(title)).getTitle()+"|"+ bookStore.get(bookStore.get(title)).getNumberOfPages());
		bookStore.remove(title);
		
	}

}
