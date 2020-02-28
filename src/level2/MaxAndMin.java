package level2;

import java.util.Arrays;

class MaxAndMin {
	public String solution(String s) {
		String answer = "";
		String[] str = s.split(" ");
		int length = str.length;
		int[] num = new int[length];
		for (int i = 0; i < length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		String s1 = Integer.toString(num[0]);
		String s2 = Integer.toString(num[length - 1]);
		answer = s1 + " " + s2;
		return answer;
	}
}
