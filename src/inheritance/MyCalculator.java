package inheritance;

public class MyCalculator extends Calculator {

	private int add;
	private int subtract;
	private int multiply;
	private int divide;

	@Override
	public int add(int i, int j) {
		add++;
		return super.add(i, j);
	}

	@Override
	public int subtract(int i, int j) {
		subtract++;
		return super.subtract(i, j);
	}

	public int multiply(int i, int j) {
		multiply++;
		return i * j;
	}

	public int divide(int i, int j) {
		divide++;
		return i / j;
	}

	public void showUsage() {
		System.out.printf("Add: %d, Subtract: %d, Multiply: %d, Divide: %d", add, subtract, multiply, divide);
	}

}
