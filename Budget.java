import java.util.Arrays;

class Budget {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d); // 1. 배열 오름차순 정렬
		for (int i = 0; i < d.length; i++) {
			if (budget >= d[i]) {
				budget -= d[i];
				answer++; 
				// 2. 예산이 신청 금액보다 크거나 같으면, 예산 - 신청 금액
				// 예산과 신청 금액의 크기를 비교 -> 뺄셈 -> 카운트 증가
			} else
				break; // 3. 아니면 반복문 탈출
		}
		return answer;
	}
}
