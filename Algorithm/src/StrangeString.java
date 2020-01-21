
class StrangeString {
	public String solution(String s) {
		String answer = "";
		String[] array = s.split(""); // ""로 쪼갰으므로 알파벳 하나씩 String에 들어감
		int cnt = 0;
		for(String str : array) { // array.length번 반복하는 enhanced for loop 사용
			cnt = str.contains(" ") ? 0 : cnt + 1; // 공백이면 cnt를 0으로 만들어줌
			answer += (cnt % 2 == 0) ? str.toLowerCase() : str.toUpperCase();
		}
		return answer;
	}
}