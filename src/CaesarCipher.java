
public class CaesarCipher {
	public String solution(String s, int n) {
	      String answer = "";
	      char ch;
	      char start;
	      int length = s.length();
	      for(int i = 0 ; i < length ; i++){
	          ch = s.charAt(i); // String의 i번째 위치에 있는 글자를 char형 ch로 바꿔줌
	          if(ch != ' ') { // 공백이 아닌 경우
	              start = Character.isUpperCase(ch)? 'A' : 'a';
	              // Character.isUpperCase()는 대문자인지 판단하여 true, false 값을 리턴
	              // ch가 대문자라면 start는 'A'가 되고, 그렇지 않으면 start는 'a'가 된다. 
	              ch = (char)((ch + n - start) % 26 + start);
		      // n이 어떤 값이든 상관없이 알파벳 26개를 순회
	          }
	          answer += ch;
	      }
	      return answer;
	  }
}
