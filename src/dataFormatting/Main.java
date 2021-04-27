package dataFormatting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		// String formatting
		String formattedString = String.format("ID: %d, Product Name: %s, Price: %.2f", 1, "Bag", 12.245);
		System.out.println(formattedString + "\n");

		// Date formatting
		SimpleDateFormat britishDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat taiwaneseDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(britishDateFormat.format(new Date()));
		System.out.println(taiwaneseDateFormat.format(new Date()));

		Date britishDate = britishDateFormat.parse("01/05/2021");
		String taiwaneseDateString = taiwaneseDateFormat.format(britishDate);
		System.out.println(taiwaneseDateString);
	}

}
