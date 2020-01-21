
class StrangeString {
	public String solution(String s) {
		String answer = "";
		String[] array = s.split(""); // ""�� �ɰ����Ƿ� ���ĺ� �ϳ��� String�� ��
		int cnt = 0;
		for(String str : array) { // array.length�� �ݺ��ϴ� enhanced for loop ���
			cnt = str.contains(" ") ? 0 : cnt + 1; // �����̸� cnt�� 0���� �������
			answer += (cnt % 2 == 0) ? str.toLowerCase() : str.toUpperCase();
		}
		return answer;
	}
}