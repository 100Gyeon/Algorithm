package level2;

class NextBigNum {
	public int solution(int n) {
		int answer = 0;
		int num_count = 0;
		int next_count = 0;
		
		// n을 2진수로 변환하고 1의 개수를 센다.
		String num = Integer.toBinaryString(n);
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1')
				num_count++;
		}

		while (true) {
			n++;
			// n의 다음 큰 숫자를 2진수로 변환하고 1의 개수를 센다.
			String next = Integer.toBinaryString(n);
			for (int i = 0; i < next.length(); i++) {
				if (next.charAt(i) == '1')
					next_count++;
			}
			
			// 두 숫자를 2진수로 변환했을 때 1의 개수가 같다면
			// 증가시킨 n의 값을 answer에 저장하고 반복문 탈출
			if (num_count == next_count) {
				answer = n;
				break;
			} else // 같지 않다면 count를 초기화하고 다음 숫자의 1의 개수를 센다.
				next_count = 0;
		}
		return answer;
	}
}
