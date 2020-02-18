package level1;

class NumericalInterval {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for(int i = 0 ; i < n ; i++){
	          answer[i] += (long) x * (i+1); 
	          // (long)이 없으면 채점 결과에서 정확성 떨어짐
		}
		return answer;
	}
}
