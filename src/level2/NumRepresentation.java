package level2;

class NumRepresentation {
	public int solution(int n) {
		int answer = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum < n) {
					continue;
				} else if (sum == n) {
					answer++;
					break;
				} else if (sum > n) { // �� ������ ������ �ð� �ʰ�
					break;
				}
			}
			sum = 0;
		}
		return answer;
	}
}