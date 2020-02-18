// 오름차순 정렬 : Arrays.sort(배열 이름);
// 내림차순 정렬 : Arrays.sort(배열 이름, Collections.reverseOrder());
// String.split(구분자);
// String.join(구분자, 배열); -> 배열을 하나의 String으로 바꿔주는 메소드

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
