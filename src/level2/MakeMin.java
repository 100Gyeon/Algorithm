package level2;

import java.util.Arrays;

class MakeMin {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		int length = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int j = length - 1;
		for (int i = 0; i < length; i++) {
			answer += A[i] * B[j];
			j--;
		}
		System.out.println("Hello Java");
		return answer;
	}
}
