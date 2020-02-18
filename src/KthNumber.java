import java.util.Arrays;

class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for(int x=0 ; x < commands.length ; x++) {
			int i = commands[x][0];
			int j = commands[x][1];
			int k = commands[x][2];
			int[] temp = Arrays.copyOfRange(array, i-1, j);
			// copyOfRange(원본 배열, 시작 인덱스, 끝 인덱스)
			// 원본 배열의 시작 인덱스에서 끝 인덱스 전까지 복사한 배열을 리턴한다.
			// 시작 인덱스는 포함되지만, 끝 인덱스는 포함되지 않는다.
			Arrays.sort(temp);
			answer[x] = temp[k-1];
		}
		return answer;
	}
}
