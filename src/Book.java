import java.sql.Date;
import java.time.LocalDateTime;

public class Book {

	private String bookName;
	private int pageNumber;
	private String authorName;
	private Date bookPublishDate;

	public Book(String bookName, int pageNumber, String authorName, Date date) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.bookPublishDate = date;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getBookPublishDate() {
		return bookPublishDate;
	}

	public void setBookPublishDate(Date bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}

}
