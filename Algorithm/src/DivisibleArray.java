import java.util.Arrays;

class DivisibleArray {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {-1}; // 나누어 떨어지는 element가 없으면 그대로 -1 반환
		int cnt = 0; // 나누어 떨어지는 element의 개수를 세기 위한 변수
		int length = arr.length;
		
		for(int i=0 ; i < length ; i++){
			if(arr[i] % divisor == 0) cnt++;
			// 배열의 element를 돌면서 divisor로 나누어 떨어지는지 계산하고, cnt를 증가시킴
		}
		
		if(cnt != 0) answer = new int[cnt];
		// 나누어 떨어지는 element가 있다면 배열의 크기를 cnt만큼 설정
		
		for(int i=0, j=0 ; i < length ; i++){
			if(arr[i] % divisor == 0)
				answer[j++] = arr[i];
		}
		
		Arrays.sort(answer);
		return answer;
	}
}
