package memoryAllocation;

import java.util.Arrays;

public class MainA {

	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2 };
		changeValueThroughPrimitiveType(intArray[0]);
		changeValueThroughObject(intArray);
		System.out.println(Arrays.toString(intArray));
	}

	public static void changeValueThroughPrimitiveType(int i) {
		i = i * 10;
	}

	public static void changeValueThroughObject(int[] array) {
		array[1] = array[1] * 10;
	}

}
