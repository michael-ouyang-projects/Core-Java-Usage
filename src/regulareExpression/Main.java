package regulareExpression;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO".matches("(\\w*)LLO"));
		System.out.println("HEOIHJOFEOILLO".replaceAll("(\\w+)LLO", "$1Y"));
	}

}
