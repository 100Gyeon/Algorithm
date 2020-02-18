package level1;

import java.util.Arrays;

class SortString {
	public String[] solution(String[] strings, int n) {
		int length = strings.length;
		String[] answer = new String[length];
		for (int i = 0; i < length; i++) {
			// 1. n��° ���ڸ� �� �տ� �ΰ�, strings ���ڿ��� ����
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		Arrays.sort(strings); // 2. ����
		for (int i = 0; i < length; i++) {
			// 3. substring�� �̿��Ͽ� ���� ���ڿ��� �迭�� ����
			// substring(beginIndex, endIndex) : beginIndex���� endIndex-1���� �ش��ϴ� substring ����
			answer[i] = strings[i].substring(1, strings[i].length());
		}
		return answer;
	}
}