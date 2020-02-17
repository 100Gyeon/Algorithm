import java.util.Arrays;

class Budget {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d); // 1. �迭 �������� ����
		for (int i = 0; i < d.length; i++) {
			if (budget >= d[i]) {
				budget -= d[i];
				answer++; 
				// 2. ������ ��û �ݾ׺��� ũ�ų� ������, ���� - ��û �ݾ�
				// ����� ��û �ݾ��� ũ�⸦ �� -> ���� -> ī��Ʈ ����
			} else
				break; // 3. �ƴϸ� �ݺ��� Ż��
		}
		return answer;
	}
}
