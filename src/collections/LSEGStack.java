package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LSEGStack {

	private List<Integer> list = new ArrayList<>();
	private TreeSet<Integer> set = new TreeSet<>();

	public static void main(String[] args) {
		LSEGStack myStack = new LSEGStack();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(5);
		myStack.push(5);
		myStack.push(5);
		System.out.println(myStack);
		System.out.println("Max: " + myStack.max1());
		System.out.println("Max: " + myStack.max2());

		System.out.println(myStack.pop());
		System.out.println(myStack);
		System.out.println("Max: " + myStack.max1());
		System.out.println("Max: " + myStack.max2());
	}

	public Integer max1() {
		Integer max = -1;
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public Integer max2() {
		return set.last();
	}

	public Integer pop() {
		int data = list.get(list.size() - 1);
		list.remove(list.size() - 1);

		int setData = set.last();
		if (!list.contains(setData)) {
			set.remove(set.last());
		}

		return data;
	}

	public void push(Integer data) {
		if (data != null) {
			list.add(data);
			set.add(data);
		}
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
