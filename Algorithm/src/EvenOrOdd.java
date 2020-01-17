
public class EvenOrOdd {
	public String solution(int num) {
	      String answer = "";
	      if(num % 2 == 0) answer = "Even";
	      else answer = "Odd";
	      return answer;
	  }
}

/* 삼항연산자로 코드를 간결하게 만들 수 있다.
 * 
 * public String solution(int num) {
 * 	return num % 2 == 0 ? "Even" : "Odd";
 * }
 * 
 */
