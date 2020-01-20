
public class FlippingNumber {
	  // String, StringBuffer 활용 문제
	  public int[] solution(long n) {
	      int[] answer = {};
	      String num = Long.toString(n); // long형 자연수를 String으로 변환
	      StringBuffer sb = new StringBuffer(num); // StringBuffer 클래스는 문자열에 대한 다양한 조작을 할 수 있는 메소드를 제공
	      sb = sb.reverse(); // StringBuffer 내의 문자들을 반대 순서로 변경
	      String[] sArray = sb.toString().split(""); // ""에 일치하는 부분을 중심으로 스트링을 분리하고, 분리된 스트링들을 배열로 저장하여 리턴
	      answer = new int[sArray.length];
	      for(int i=0 ; i < sArray.length ; i++) {
	    	  answer[i] = Integer.parseInt(sArray[i]);
	      }
	      return answer;
	  }
}
