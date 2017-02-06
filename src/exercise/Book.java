package exercise;

public class Book {
private int id;
private String title;
private int numberOfPages;
	
	public Book(int id, String title, int numberOfPages) {
		super();
		this.id = id;
		this.title = title;
		this.numberOfPages = numberOfPages;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}
	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public void setChange(String change) {
		
		setTitle(change);
	}
public void setChange(int change) {
	setNumberOfPages(change);
		
	}
}
