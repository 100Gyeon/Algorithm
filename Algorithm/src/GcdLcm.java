
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

/* ��Ŭ���� ȣ���� Ȱ��
	1. �� ���� ũ�� ��
	2. ū ���� ���� ���� ���� ������ ���ϱ�
		1) if �������� 0�̸�
			�ִ����� = ���� �� 
			�ּҰ���� = �� ���� �� / �ִ�����
		2) else
			ū �� = ���� ��
			���� �� = ������
*/