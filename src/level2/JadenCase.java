package level2;

class JadenCase {
	public String solution(String s) {
		String answer = "";
		answer = s.substring(0, 1).toUpperCase(); // ù ���ڴ� ������ �빮��
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += " "; // String s�� i��° ��ġ�� ���Ⱑ �ִ� ��� : answer�� ���� �߰�
			} else if (s.charAt(i) != ' ') {
				if (s.charAt(i - 1) == ' ') // �ƴ� ��� : i��° �տ� ���Ⱑ �ִ��� Ȯ��
					answer += s.substring(i, i + 1).toUpperCase(); // ���� ����� �빮�ڷ� �߰�
				else
					answer += s.substring(i, i + 1).toLowerCase(); // �ƴϸ� �ҹ��ڷ� �߰�
			}
		}
		return answer;
	}
}
