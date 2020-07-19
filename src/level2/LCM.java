package level2;

class LCM {
	int euclid(int x, int y) { // ��Ŭ���� ȣ����
		int min = Math.min(x, y);
		int max = Math.max(x, y);
		int gcd, lcm;

		while (true) {
			int result = max % min;
			if (result == 0) {
				gcd = min; // �ִ�����
				lcm = x * y / gcd; // �ּҰ���� = �� ���� �� / �ִ�����
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
