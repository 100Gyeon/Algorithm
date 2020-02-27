package level2;

import java.util.Arrays;
import java.util.Comparator;

class BiggestNum {
	public String solution(int[] numbers) {
		String answer = "";
		int length = numbers.length;
		String[] num = new String[length];
		// 주어진 int 배열을 String 배열로 바꿔준다.
		for (int i = 0; i < length; i++) {
			num[i] = Integer.toString(numbers[i]);
		}

		// String 배열인 num을 특정 기준에 따라 정렬한다. 
		Arrays.sort(num, new Comparator<String>() {

			@Override
			public int compare(String n1, String n2) {
				// 길이가 같으면 바로 숫자끼리 크기 비교
				if (n1.length() == n2.length()) {
					return n2.compareTo(n1);
				}
				// 길이가 다르면 두 숫자를 합친 것끼리 크기 비교
				else {
					String concat = n1 + n2;
					String reverseConcat = n2 + n1;
					return reverseConcat.compareTo(concat);
				}
			}

		});
		
		if (num.length > 0 && num[0].equals("0"))
			answer = "0";
		else {
			StringBuilder sb = new StringBuilder();
			for (String str : num) {
				sb.append(str);
			}
			answer = sb.toString();
		}
		
		return answer;
	}
}
