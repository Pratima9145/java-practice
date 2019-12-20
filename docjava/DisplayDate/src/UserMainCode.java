import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class UserMainCode {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String dte;
		dte = s.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(dte, formatter);
		System.out.println(date);

	}

}
