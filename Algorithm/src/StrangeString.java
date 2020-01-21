
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

/* 첫 번째 풀이는 시간 초과
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
