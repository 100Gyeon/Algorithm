package level1;

import java.util.HashMap;

class GymClothes {
	public int solution(int n, int[] lost, int[] reserve) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int answer = 0;

		for (int i = 1; i <= n; i++) // 기본적으로 모든 학생은 체육복을 가지고 있는 상태(0으로 표시)
			map.put(i, 0);

		for (int student : reserve) // 반복할 때마다 student는 reserve[0], reserve[1], ... 로 설정 
			map.put(student, map.get(student) + 1); // 여분을 가지고 있으면 +1

		for (int student : lost)
			map.put(student, map.get(student) - 1); // 도난당했으면 -1

		for (int i = 1; i <= n; i++) {
			if (map.get(i) == -1) { // i번째 학생이 체육복을 분실했으면
				// 앞에 학생이 있는지 확인, 앞에 있는 학생이 여분을 가지고 있는지 확인
				if (map.containsKey(i-1) && map.get(i-1) == 1) {
					// 빌리면 둘 다 0이 된다.
					map.put(i, 0);
					map.put(i-1, 0);
				} 
				// 뒤에 학생이 있는지 확인, 뒤에 있는 학생이 여분을 가지고 있는지 확인
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
