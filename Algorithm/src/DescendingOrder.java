import java.util.Arrays;
import java.util.Collections;

class DescendingOrder {
	  public long solution(long n) {
	      long answer = 0;
	      String[] str = Long.toString(n).split("");
	      Arrays.sort(str, Collections.reverseOrder());
	      String s = String.join("", str);
	      answer = Long.parseLong(s);
	      return answer;
	  }
}
