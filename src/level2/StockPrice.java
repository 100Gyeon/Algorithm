package level2;

public class StockPrice {
	public static int[] solution(int[] prices) {
		int time = 0;
		int length = prices.length;
		int[] answer = new int[length];

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				time++;
				if (prices[j] < prices[i]) {
					break;
				}
			}
			answer[i] = time;
			time = 0;
		}

		return answer;
	}
}
