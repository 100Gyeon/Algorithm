
public class CaesarCipher {
	public String solution(String s, int n) {
	      String answer = "";
	      char ch;
	      char start;
	      int length = s.length();
	      for(int i = 0 ; i < length ; i++){
	          ch = s.charAt(i); // String�� i��° ��ġ�� �ִ� ���ڸ� char�� ch�� �ٲ���
	          if(ch != ' ') { // ������ �ƴ� ���
	              start = Character.isUpperCase(ch)? 'A' : 'a';
	              // Character.isUpperCase()�� �빮������ �Ǵ��Ͽ� true, false ���� ����
	              // ch�� �빮�ڶ�� start�� 'A'�� �ǰ�, �׷��� ������ start�� 'a'�� �ȴ�. 
	              ch = (char)((ch + n - start) % 26 + start);
	          }
	          answer += ch;
	      }
	      return answer;
	  }
}
