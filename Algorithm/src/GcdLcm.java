
class GcdLcm {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int min = Math.min(n, m);
		int max = Math.max(n, m);

		while (true) {
			int result = max % min;
			if (result == 0) {
				answer[0] = min;
				answer[1] = n * m / answer[0];
				break;
			} else {
				max = min;
				min = result;
			}
		}

		return answer;
	}
}

/* 유클리드 호제법 활용
	1. 두 수의 크기 비교
	2. 큰 수를 작은 수로 나눈 나머지 구하기
		1) if 나머지가 0이면
			최대공약수 = 작은 수 
			최소공배수 = 두 수의 곱 / 최대공약수
		2) else
			큰 수 = 작은 수
			작은 수 = 나머지
*/