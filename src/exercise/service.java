package exercise;

import java.util.HashMap;
import java.util.Map;

public class service {
	static Map<String, Book> bookStore = new HashMap<>();

	public static void addToMap(Book book) {
		bookStore.put(book.getTitle(), book);
	}

	public static void deleteFromMap(String title, Book book) {
		bookStore.remove(title, book);
	}

}
