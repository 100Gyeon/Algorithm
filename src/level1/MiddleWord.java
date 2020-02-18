package level1;

// substring(start,end) : 문자열의 start부터 end 전까지 리턴
class MiddleWord {
	public String solution(String s) {
		String answer = "";
		int length = s.length();
		if (length % 2 != 0) {
			answer = s.substring(length / 2, length / 2 + 1);
			return answer;
		} else {
			answer = s.substring(length / 2 - 1, length / 2 + 1);
			return answer;
		}
	}
}
