package level1;

class NumericalInterval {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for(int i = 0 ; i < n ; i++){
	          answer[i] += (long) x * (i+1); 
	          // (long)�� ������ ä�� ������� ��Ȯ�� ������
		}
		return answer;
	}
}