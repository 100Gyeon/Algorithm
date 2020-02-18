
class HidePhoneNumber {
	public String solution(String phone_number) {
		String answer = "";
		int length = phone_number.length();
		for(int i=0 ; i < length ; i++) {
			answer += (length - i <= 4) ? phone_number.charAt(i) : "*";
		}
		return answer;
	}
}

/* 다른 풀이
 * public String solution(String phone_number) {
 * 	char[] ch = phone_number.toCharArray();
 * 	for(int i=0 ; i < ch.length - 4 ; i++){
 * 		ch[i] = '*';
 * 	}
 * 	return String.valueOf(ch);
 * }
 */
