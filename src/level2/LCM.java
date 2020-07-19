package level2;

class LCM {
	int euclid(int x, int y) { // 유클리드 호제법
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		int gcd, lcm;

		while (true) {
			int result = max % min;
			if (result == 0) {
				gcd = min; // 최대공약수
				lcm = x * y / gcd; // 최소공배수 = 두 수의 곱 / 최대공약수
				break;
			} else {
				max = min;
				min = result;
			}
		}

		return lcm;
	}

	public int solution(int[] arr) {
		int answer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			answer = euclid(answer, arr[i]);
		}
		return answer;
	}
}
