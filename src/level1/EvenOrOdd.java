package level1;

public class EvenOrOdd {
	public String solution(int num) {
	      String answer = "";
	      if(num % 2 == 0) answer = "Even";
	      else answer = "Odd";
	      return answer;
	  }
}

/* ���׿����ڷ� �ڵ带 �����ϰ� ���� �� �ִ�.
 * 
 * public String solution(int num) {
 * 	return num % 2 == 0 ? "Even" : "Odd";
 * }
 * 
 */