package inheritance.without;

public class Main {

	public static void main(String[] args) {
		int[] usage = new int[] { 0, 0, 0, 0 };

		usage = add(10, 5, usage);
		usage = add(10, 5, usage);
		usage = subtract(10, 5, usage);
		usage = multiply(10, 5, usage);
		usage = multiply(10, 5, usage);
		usage = divide(10, 5, usage);
		System.out.printf("Add: %d, Subtract: %d, Multiply: %d, Divide: %d", usage[0], usage[1], usage[2], usage[3]);
	}

	public static int[] add(int i, int j, int[] usage) {
		System.out.println(CalculatorUtil.add(i, j));
		return new int[] { ++usage[0], usage[1], usage[2], usage[3] };
	}

	public static int[] subtract(int i, int j, int[] usage) {
		System.out.println(CalculatorUtil.subtract(i, j));
		return new int[] { usage[0], ++usage[1], usage[2], usage[3] };
	}

	public static int[] multiply(int i, int j, int[] usage) {
		System.out.println(MyCalculatorUtil.multiply(i, j));
		return new int[] { usage[0], usage[1], ++usage[2], usage[3] };
	}

	public static int[] divide(int i, int j, int[] usage) {
		System.out.println(MyCalculatorUtil.divide(i, j));
		return new int[] { usage[0], usage[1], usage[2], ++usage[3] };
	}

}
