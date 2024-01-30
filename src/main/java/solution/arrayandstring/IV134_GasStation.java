package solution.arrayandstring;

import java.util.ArrayList;
import java.util.List;

public class IV134_GasStation {

	public static void main(String[] args) {

		// gas 2,3,4 cost 3,4,3
		// gas 1,2,3,4,5 cost 3,4,5,1,2

		int gas[] = { 2, 2, 2, 4, 5 };
		int cost[] = { 3, 4, 5, 1, 2 };

//		int gas[] = { 2, 3, 4 };
//		int cost[] = { 3, 4, 3 };

//		int gas[] = { 5, 1, 2, 3, 4 };
//		int cost[] = { 4, 4, 1, 5, 1 };

		// possibleStartingIndex = {3 , 4}

		IV134_GasStation obj = new IV134_GasStation();
		obj.canCompleteCircuit(gas, cost);
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int remainingGas = 0;
		int canCompleteIndex = -1;

		List<Integer> possibleStartingIndex = new ArrayList<>();

		// find all starting point
		for (int i = 0; i < gas.length; i++) {
			if (gas[i] >= cost[i]) {
				possibleStartingIndex.add(i);
			}
		}

		System.out.println(possibleStartingIndex);

		for (int i = 0; i < possibleStartingIndex.size(); i++) {
			int currentStartingIndex = possibleStartingIndex.get(i), travelingIndex = possibleStartingIndex.get(i);

			boolean isFirstTimeTravel = true;

			while (isFirstTimeTravel || (travelingIndex != currentStartingIndex && (remainingGas > 0))) {

				if (isFirstTimeTravel) {
					isFirstTimeTravel = !isFirstTimeTravel;
					remainingGas += gas[travelingIndex];
				}

				remainingGas -= cost[travelingIndex];

				if (travelingIndex == gas.length - 1) {
					travelingIndex = 0;
				} else {
					travelingIndex++;
				}

				if (travelingIndex != currentStartingIndex && remainingGas > 0) {

					remainingGas += gas[travelingIndex];
				}
			}

			if (remainingGas >= 0 && travelingIndex == currentStartingIndex) {
				canCompleteIndex = currentStartingIndex;
				break;
			}

			remainingGas = 0;
		}

		System.out.println(canCompleteIndex);

		return canCompleteIndex;
	}

}
