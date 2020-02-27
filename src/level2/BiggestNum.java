package level2;

import java.util.Arrays;
import java.util.Comparator;

class BiggestNum {
	public String solution(int[] numbers) {
		String answer = "";
		int length = numbers.length;
		String[] num = new String[length];
		// �־��� int �迭�� String �迭�� �ٲ��ش�.
		for (int i = 0; i < length; i++) {
			num[i] = Integer.toString(numbers[i]);
		}

		// String �迭�� num�� Ư�� ���ؿ� ���� �����Ѵ�. 
		Arrays.sort(num, new Comparator<String>() {

			@Override
			public int compare(String n1, String n2) {
				// ���̰� ������ �ٷ� ���ڳ��� ũ�� ��
				if (n1.length() == n2.length()) {
					return n2.compareTo(n1);
				}
				// ���̰� �ٸ��� �� ���ڸ� ��ģ �ͳ��� ũ�� ��
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
