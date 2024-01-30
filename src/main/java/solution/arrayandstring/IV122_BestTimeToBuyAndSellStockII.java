package solution.arrayandstring;

public class IV122_BestTimeToBuyAndSellStockII {

	public static void main(String args[]) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };

		IV122_BestTimeToBuyAndSellStockII obj = new IV122_BestTimeToBuyAndSellStockII();

		obj.maxProfit(prices);

	}

	public int maxProfit(int[] prices) {

		int accumProfit = 0;
		int currentBuyPrice = prices[0];

		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] < prices[i] || i == prices.length - 2) {

				if (i == prices.length - 2 && prices[i + 1] > prices[i]) {
					accumProfit += prices[i + 1] - currentBuyPrice;
				} else {
					accumProfit += (prices[i] - currentBuyPrice);
				}

				currentBuyPrice = prices[i + 1];
			}
		}
		System.out.println(accumProfit);

		return accumProfit;

	}

}
