package level2;

class NextBigNum {
	public int solution(int n) {
		int answer = 0;
		int num_count = 0;
		int next_count = 0;
		
		// n�� 2������ ��ȯ�ϰ� 1�� ������ ����.
		String num = Integer.toBinaryString(n);
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1')
				num_count++;
		}

		while (true) {
			n++;
			// n�� ���� ū ���ڸ� 2������ ��ȯ�ϰ� 1�� ������ ����.
			String next = Integer.toBinaryString(n);
			for (int i = 0; i < next.length(); i++) {
				if (next.charAt(i) == '1')
					next_count++;
			}
			
			// �� ���ڸ� 2������ ��ȯ���� �� 1�� ������ ���ٸ�
			// ������Ų n�� ���� answer�� �����ϰ� �ݺ��� Ż��
			if (num_count == next_count) {
				answer = n;
				break;
			} else // ���� �ʴٸ� count�� �ʱ�ȭ�ϰ� ���� ������ 1�� ������ ����.
				next_count = 0;
		}
		return answer;
	}
}
