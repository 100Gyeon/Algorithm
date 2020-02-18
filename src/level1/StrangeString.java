package level1;

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

/* ù ��° Ǯ�̴� �ð� �ʰ�
* public String solution(String s) { 
* 	String answer = "";
* 	String[] str = s.split(" ");
* 	int i,j;
* 	int length = str.length;
* 	for(i=0 ; i < length ; i++){
* 		for(j=0 ; j < str[i].length() ; j++){
* 			if(j%2 == 0)
* 				answer += str[i].toUpperCase().charAt(j);
* 			else
* 				answer += str[i].toLowerCase().charAt(j);
*	 	}
* 		if(i != length-1) answer += " ";
* 	}
* 	return answer;
* }
*/
