import java.util.Arrays;

class DivisibleArray {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {-1}; // ������ �������� element�� ������ �״�� -1 ��ȯ
		int cnt = 0; // ������ �������� element�� ������ ���� ���� ����
		int length = arr.length;
		
		for(int i=0 ; i < length ; i++){
			if(arr[i] % divisor == 0) cnt++;
			// �迭�� element�� ���鼭 divisor�� ������ ���������� ����ϰ�, cnt�� ������Ŵ
		}
		
		if(cnt != 0) answer = new int[cnt];
		// ������ �������� element�� �ִٸ� �迭�� ũ�⸦ cnt��ŭ ����
		
		for(int i=0, j=0 ; i < length ; i++){
			if(arr[i] % divisor == 0)
				answer[j++] = arr[i];
		}
		
		Arrays.sort(answer);
		return answer;
	}
}
