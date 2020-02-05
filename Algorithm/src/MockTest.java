import java.util.ArrayList;

class MockTest {
	public int[] solution(int[] answers) {
		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int count1 = 0, count2 = 0, count3 = 0;
		int length = answers.length;
		for (int i = 0; i < length; i++) {
			if (answers[i] == p1[i % 5])
				count1++;
			if (answers[i] == p2[i % 8])
				count2++;
			if (answers[i] == p3[i % 10])
				count3++;
		}

		int max = Math.max(Math.max(count1, count2), count3);
		ArrayList<Integer> al = new ArrayList<Integer>();
		if (count1 == max)
			al.add(1);
		if (count2 == max)
			al.add(2);
		if (count3 == max)
			al.add(3);

		int answer[] = new int[al.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);
		}

		return answer;
	}
}
