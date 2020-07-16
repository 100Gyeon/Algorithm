package level2;

import java.util.PriorityQueue;
// PriorityQueue : add(); peek(); poll(); 등의 메소드 사용 가능
// 낮은 숫자의 우선순위가 높다.
// 높은 숫자의 우선순위가 높은 것으로 변경하려면 
// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


class Scoville {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
		// 배열을 우선순위 큐에 옮긴다.
		for (int i : scoville) {
			pq.add(i);
		}

		while (true) {
			// peek() : 큐에서 가장 작은 숫자를 추출
			if (pq.peek() >= K) {
				break;
			}
			// 음식이 하나면 섞을 음식이 없으므로 -1을 리턴
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