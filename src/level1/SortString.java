package level1;

import java.util.Arrays;

class SortString {
	public String[] solution(String[] strings, int n) {
		int length = strings.length;
		String[] answer = new String[length];
		for (int i = 0; i < length; i++) {
			// 1. n번째 문자를 맨 앞에 두고, strings 문자열과 결합
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		Arrays.sort(strings); // 2. 정렬
		for (int i = 0; i < length; i++) {
			// 3. substring을 이용하여 원래 문자열을 배열에 저장
			// substring(beginIndex, endIndex) : beginIndex부터 endIndex-1까지 해당하는 substring 리턴
			answer[i] = strings[i].substring(1, strings[i].length());
		}
		return answer;
	}
}