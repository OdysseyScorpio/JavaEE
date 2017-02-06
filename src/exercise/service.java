package exercise;

import java.util.HashMap;
import java.util.Map;

public class service {
	static Map<String, Book> bookStore = new HashMap<>();

	public static void addToMap(Book book) {
		bookStore.put(book.getTitle(), book);
		System.out.println("Adding");
		System.out.println(book.toString());
	}

	public static void deleteFromMap(String title) {
		System.out.println("Removing " + title);
		Book book = bookStore.get(title);
		System.out.println(book.toString());

		bookStore.remove(title);

	}

	public static void updateToMap(String title, String change) {
		System.out.println("Changing " + title + " to " + change);
		Book book = bookStore.get(title);
		System.out.println(book.toString());

		book.setChange(change);
		System.out.println(book.toString());
	}

	public static void updateToMap(String title, int change) {
		System.out.println("Changing " + title + " to " + change);
		Book book = bookStore.get(title);
		System.out.println(book.toString());

		book.setChange(change);
		System.out.println(book.toString());
	}
}
