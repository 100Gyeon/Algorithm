package level2;

import java.util.PriorityQueue;
// PriorityQueue : add(); peek(); poll(); ���� �޼ҵ� ��� ����
// ���� ������ �켱������ ����.
// ���� ������ �켱������ ���� ������ �����Ϸ��� 
// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


class Scoville {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
		// �迭�� �켱���� ť�� �ű��.
		for (int i : scoville) {
			pq.add(i);
		}

		while (true) {
			// peek() : ť���� ���� ���� ���ڸ� ����
			if (pq.peek() >= K) {
				break;
			}
			// ������ �ϳ��� ���� ������ �����Ƿ� -1�� ����
			else if (pq.size() == 1) {
				return -1;
			} else {
				pq.add(pq.poll() + (pq.poll() * 2));
				answer++;
			}
		}
		return answer;
	}
}