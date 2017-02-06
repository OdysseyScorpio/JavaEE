package exercise;

import java.util.HashMap;
import java.util.Map;

public class service {
	static Map<String, Book> bookStore = new HashMap<>();

	public static void addToMap(Book book) {
		bookStore.put(book.getTitle(), book);
		System.out.println("Adding");
		System.out.println(
				bookStore.get(book.getTitle()).getTitle() + "|" + bookStore.get(book.getTitle()).getNumberOfPages());
	}

	public static void deleteFromMap(String title) {
		System.out.println("Removing " + title);
		System.out.println(bookStore.get(title).getTitle() + "|" + bookStore.get(title).getNumberOfPages());

		bookStore.remove(title);

	}

	public static void updateToMap(String title, String change) {
		System.out.println("Changing " + title + " to " + change);
		System.out.println(bookStore.get(title).getTitle() + "|" + bookStore.get(title).getNumberOfPages());

		Book book = bookStore.get(title);
		book.setChange(change);
		System.out.println(bookStore.get(title).getTitle() + "|" + bookStore.get(title).getNumberOfPages());
	}

	public static void updateToMap(String title, int change) {
		System.out.println("Changing " + title + " to " + change);
		System.out.println(bookStore.get(title).getTitle() + "|" + bookStore.get(title).getNumberOfPages());

		Book book = bookStore.get(title);
		book.setChange(change);
		System.out.println(bookStore.get(title).getTitle() + "|" + bookStore.get(title).getNumberOfPages());
	}
}
