package solution;

public class IV121_BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };

		IV121_BestTimeToBuyAndSellStock obj = new IV121_BestTimeToBuyAndSellStock();

		obj.maxProfit(prices);

	}

// solution 1: doesn't work. Got time exceeded.
//	public int maxProfit(int[] prices) {
//
//		int maxProfit = 0;
//		int currentProfit = 0;
//
//		for (int i = 0; i < prices.length; i++) {
//
//			for (int j = i + 1; j < prices.length; j++) {
//				if (prices[i] < prices[j]) {
//					currentProfit = prices[j] - prices[i];
//				}
//
//				if (maxProfit < currentProfit) {
//					maxProfit = currentProfit;
//				}
//			}
//
//		}
//
//		System.out.println(maxProfit);
//
//		return maxProfit;
//
//	}

//this solution got accepted
//	public int maxProfit(int[] prices) {
//
//		int maxProfit = 0;
//		int currentProfit = 0;
//		int minimumPrice = prices[0];
//
//		if (prices.length > 0) {
//			for (int i = 0; i < prices.length; i++) {
//
//				if (prices[i] < minimumPrice) {
//					minimumPrice = prices[i];
//				}
//
//				currentProfit = prices[i] - minimumPrice;
//
//				if (maxProfit < currentProfit) {
//					maxProfit = currentProfit;
//				}
//
//			}
//
//		}
//
//		System.out.println(maxProfit);
//
//		return maxProfit;
//
//	}

	// shortest form
	public int maxProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			minPrice = Math.min(minPrice, price);
			maxProfit = Math.max(maxProfit, price - minPrice);
		}

		System.out.println(maxProfit);

		return maxProfit;

	}

}
