package regulareExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

		// \d: A digit: [0-9]
		// \w: A word character: [a-zA-Z_0-9]
		String phonePattern = "09\\d{8}";
		System.out.println("0912345678".matches(phonePattern));
		System.out.println("091234567".matches(phonePattern));
		System.out.println("09123456789".matches(phonePattern));
		System.out.println("091234567x".matches(phonePattern));
		System.out.println("00912345678".matches(phonePattern) + "\n");

		// *: zero or more times, short for {0,}
		// +: one or more times, short for {1,}
		// ?: no or one times, short for {0,1}
		String emailPattern = "\\w{1,}@[a-zA-Z0-9_.-]{1,}\\.[a-z]{2,6}";
		System.out.println("michael@gmail.com.tw".matches(emailPattern));

		String emailPattern2 = "\\w+@([a-zA-Z0-9_-]+\\.)+[a-z]{2,6}";
		System.out.println("michael@gmail..com.tw".matches(emailPattern2) + "\n");

		System.out.println("UserService.java".replaceAll("(\\w+)Service\\.java", "$1ServiceImpl.java") + "\n");

		Pattern pattern = Pattern.compile("a(\\d)");
		Matcher macher = pattern.matcher("a1 a2 a3 a4 a5");
		while (macher.find()) {
			System.out.println(macher.group(1));
		}
	}

}
