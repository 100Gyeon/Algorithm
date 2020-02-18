
class CollatzConjecture {
	public int solution(long num) {
		int answer = 0;
		int count = 0;
		while(num != 1 && count != 500){ // num이 1이거나 count가 500이면 while문 벗어남
			if(num % 2 == 0){
				count++;
				num /= 2;
			}
			else{
				count++;
				num = num * 3 + 1;
			}
		}
		if(count == 500){
			answer = -1;
			return answer;
		}
		answer = count;
		return answer;
	}
}
