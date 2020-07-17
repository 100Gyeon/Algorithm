package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
	public int solution(int[] priorities, int location) {
		int answer = 1;
		int length = priorities.length;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		// �迭�� �켱���� ť�� �ű��.
		for (int i : priorities) {
			pq.add(i);
		}

		while (!pq.isEmpty()) {
			for (int i = 0; i < length; i++) {
				if (priorities[i] == pq.peek()) {
					if (i == location)
						return answer;
					pq.poll();
					answer++;
				}
			}
		}

		return answer;
	}
}
