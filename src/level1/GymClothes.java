package level1;

import java.util.HashMap;

class GymClothes {
	public int solution(int n, int[] lost, int[] reserve) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int answer = 0;

		for (int i = 1; i <= n; i++) // �⺻������ ��� �л��� ü������ ������ �ִ� ����(0���� ǥ��)
			map.put(i, 0);

		for (int student : reserve) // �ݺ��� ������ student�� reserve[0], reserve[1], ... �� ���� 
			map.put(student, map.get(student) + 1); // ������ ������ ������ +1

		for (int student : lost)
			map.put(student, map.get(student) - 1); // ������������ -1

		for (int i = 1; i <= n; i++) {
			if (map.get(i) == -1) { // i��° �л��� ü������ �н�������
				// �տ� �л��� �ִ��� Ȯ��, �տ� �ִ� �л��� ������ ������ �ִ��� Ȯ��
				if (map.containsKey(i-1) && map.get(i-1) == 1) {
					// ������ �� �� 0�� �ȴ�.
					map.put(i, 0);
					map.put(i-1, 0);
				} 
				// �ڿ� �л��� �ִ��� Ȯ��, �ڿ� �ִ� �л��� ������ ������ �ִ��� Ȯ��
				else if (map.containsKey(i+1) && map.get(i+1) == 1) {
					map.put(i, 0);
					map.put(i+1, 0);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			if (map.get(i) != -1)
				answer++;
		}

		return answer;
	}
}
