import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {

		TreeSet<Book> set = new TreeSet(new SortedBookByName());

		set.add(new Book("Yüzüklerin Efendisi", 521, "Halil Ýbrahim", new Date(1995, 04, 13)));
		set.add(new Book("Kraliyet Ailesi", 314, "Taþ Kafalý Mahmut", new Date(1994, 03, 10)));
		set.add(new Book("Saz Çalar", 121, "Kel Ahmet", new Date(2021, 11, 17)));
		set.add(new Book("Beni Vurdular Ana", 782, "Küçük Emrah", new Date(2002, 01, 22)));
		set.add(new Book("Cane Cane Cane", 541, "Halay Baþý Hüso", new Date(1999, 10, 27)));

		set.forEach(k -> System.out.println(k.getBookName()));
		System.out.println("- - - - - - - - -  - -");

		TreeSet<Book> set1 = new TreeSet(new SortedBookByPageNumber());

		set1.add(new Book("Yüzüklerin Efendisi", 521, "Halil Ýbrahim", new Date(1995, 04, 13)));
		set1.add(new Book("Kraliyet Ailesi", 314, "Taþ Kafalý Mahmut", new Date(1994, 03, 10)));
		set1.add(new Book("Saz Çalar", 121, "Kel Ahmet", new Date(2021, 11, 17)));
		set1.add(new Book("Beni Vurdular Ana", 782, "Küçük Emrah", new Date(2002, 01, 22)));
		set1.add(new Book("Cane Cane Cane", 541, "Halay Baþý Hüso", new Date(1999, 10, 27)));

		set1.forEach(k -> System.out.println("Page Number: " + k.getPageNumber()));

	}

}
