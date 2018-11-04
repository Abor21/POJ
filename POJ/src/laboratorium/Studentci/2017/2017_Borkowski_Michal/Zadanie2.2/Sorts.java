import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public interface Sorts
{

	// sortowanie po cenie rosn�co
	default void sortByPriceAsc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, (o1, o2) -> {
			return o1.getCar().getPrice() > o2.getCar().getPrice() ? 1 :
				o1.getCar().getPrice() < o2.getCar().getPrice() ? -1 : 0;
		});
	}
	
	// sortowanie po cenie malej�ca
	default void sortByPriceDesc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, Collections.reverseOrder((o1, o2) -> {
			return o1.getCar().getPrice() > o2.getCar().getPrice() ? 1 :
				o1.getCar().getPrice() < o2.getCar().getPrice() ? -1 : 0;
		}));
	}
	
	// sortowanie po przebiegu rosn�co
	default void sortByMileageAsc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, (o1, o2) -> {
			return o1.getCar().getMileage() > o2.getCar().getMileage() ? 1 :
				o1.getCar().getMileage() < o2.getCar().getMileage() ? -1 : 0;
		});
	}
	
	// sortowanie po przebiegu malej�co
	default void sortByMileageDesc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, Collections.reverseOrder((o1, o2) -> {
			return o1.getCar().getMileage() > o2.getCar().getMileage() ? 1 :
				o1.getCar().getMileage() < o2.getCar().getMileage() ? -1 : 0;
		}));
	}
	
	// sortowanie po roczniku rosn�co
	default void sortByYearAsc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, (o1, o2) -> {
			return o1.getCar().getYear() > o2.getCar().getYear() ? 1 :
				o1.getCar().getYear() < o2.getCar().getYear() ? -1 : 0;
		});
	}
	
	// sortowanie po roczniku malej�co
	default void sortByYearDesc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, Collections.reverseOrder((o1, o2) -> {
			return o1.getCar().getYear() > o2.getCar().getYear() ? 1 :
				o1.getCar().getYear() < o2.getCar().getYear() ? -1 : 0;
		}));
	}
	
	// sortowanie po tytule rosnaco
	default void sortByTitleAsc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, (o1 , o2) -> o1.getTitle().compareToIgnoreCase(o2.getTitle()));
	}
	
	// sortowanie po tytule malejaco
	default void sortByTitleDesc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, Collections.reverseOrder((o1 , o2) -> o1.getTitle().compareToIgnoreCase(o2.getTitle())));
	}
	
	// sortowanie po dacie dodania rosn�co
	default void sortByDateAsc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, Comparator.comparing(Announcement::getDate));
	}
	
	// sortowanie po dacie dodania malej�co
	default void sortByDateDesc(ArrayList<Announcement> announcements)
	{
		Collections.sort(announcements, Comparator.comparing(Announcement::getDate).reversed());
	}
	
}
