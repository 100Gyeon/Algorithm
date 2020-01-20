
public class FlippingNumber {
	  public int[] solution(long n) {
	      int[] answer = {};
	      String num = Long.toString(n);
	      StringBuffer sb = new StringBuffer(num);
	      sb = sb.reverse();
	      String[] sArray = sb.toString().split("");
	      answer = new int[sArray.length];
	      for(int i=0 ; i < sArray.length ; i++) {
	    	  answer[i] = Integer.parseInt(sArray[i]);
	      }
	      return answer;
	  }
}
