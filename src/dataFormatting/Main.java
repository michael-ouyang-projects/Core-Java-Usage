package dataFormatting;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws ParseException {
		// String formatting
		int id = 1;
		String productName = "Bag";
		double price = 12.245;
		System.out.println("ID: " + id + ", Product Name: " + productName + ", Price: " + price);
		System.out.println(String.format("ID: %d, Product Name: %s, Price: %.3f\n", id, productName, price));

		// Date formatting
		SimpleDateFormat britishDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat taiwaneseDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(britishDateFormat.format(new Date()));
		System.out.println(taiwaneseDateFormat.format(new Date()));

		Date britishDate = britishDateFormat.parse("01/05/2021");
		String taiwaneseDateString = taiwaneseDateFormat.format(britishDate);
		System.out.println(taiwaneseDateString + "\n");

		// Decimal formatting
		DecimalFormat decimalFormat = new DecimalFormat("000.00");
		System.out.println(decimalFormat.format(12));
		System.out.println(decimalFormat.format(12.2));
		System.out.println(decimalFormat.format(12.245));
		System.out.println(decimalFormat.format(12.246));
		System.out.println(decimalFormat.format(1212.246) + "\n");

		// Message formatting
		MessageFormat usMessageFormat = new MessageFormat("Date: {0,date}, Time: {0,time}, {1}, {2}", Locale.US);
		MessageFormat twMessageFormat = new MessageFormat("Date: {0,date}, Time: {0,time}, {1}, {2}", Locale.TAIWAN);
		System.out.println(usMessageFormat.format(new Object[] { new Date(), "Happy!", 20 }));
		System.out.println(twMessageFormat.format(new Object[] { new Date(), "Happy!", 20 }));

		System.out.println(MessageFormat.format("Hello, My name is {0}, I''m {1} years old", "Bob", 12));
	}

}
