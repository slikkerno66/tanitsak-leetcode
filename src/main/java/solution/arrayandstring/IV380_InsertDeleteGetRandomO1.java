package solution.arrayandstring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IV380_InsertDeleteGetRandomO1 {

	List<Integer> data;
	Random random;

	public static void main(String[] args) {
		IV380_InsertDeleteGetRandomO1 obj = new IV380_InsertDeleteGetRandomO1();

		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);

		System.out.println(obj.getRandom());
	}

	public IV380_InsertDeleteGetRandomO1() {
		data = new ArrayList<>();
		random = new Random();
	}

	public boolean insert(int val) {
		if (!data.contains(val)) {
			data.add(val);
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(int val) {

		int removeIndex = data.indexOf(val);

		System.out.println(removeIndex);

		if (removeIndex != -1) {
			data.remove(removeIndex);
			return true;
		} else {
			return false;
		}

	}

	public int getRandom() {

		int randomElement = -1;

		if (data.size() != 0) {
			int randomNum = random.nextInt(data.size());
			randomElement = data.get(randomNum);
		}

		return randomElement;
	}

}
