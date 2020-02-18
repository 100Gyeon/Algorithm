import java.util.Arrays;
import java.util.Collections;

class ReverseString {
	public String solution(String s) {
		String answer = "";
		String[] str = s.split("");
		Arrays.sort(str, Collections.reverseOrder());
		answer = String.join("", str);
		return answer;
	}
}