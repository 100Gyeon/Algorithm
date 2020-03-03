package level2;

class JadenCase {
	public String solution(String s) {
		String answer = "";
		answer = s.substring(0, 1).toUpperCase(); // 첫 글자는 무조건 대문자
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += " "; // String s의 i번째 위치에 띄어쓰기가 있는 경우 : answer에 띄어쓰기 추가
			} else if (s.charAt(i) != ' ') {
				if (s.charAt(i - 1) == ' ') // 아닌 경우 : i번째 앞에 띄어쓰기가 있는지 확인
					answer += s.substring(i, i + 1).toUpperCase(); // 앞이 띄어쓰기면 대문자로 추가
				else
					answer += s.substring(i, i + 1).toLowerCase(); // 아니면 소문자로 추가
			}
		}
		return answer;
	}
}
