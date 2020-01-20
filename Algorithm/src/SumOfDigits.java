
public class SumOfDigits {
	public int solution(int n) {
		int answer = 0;
        String s = Integer.toString(n);
        StringBuffer sb = new StringBuffer(s);
        String[] sArray = sb.toString().split("");
        for(int i=0 ; i<sArray.length ; i++){
            answer += Integer.parseInt(sArray[i]);
        }
        return answer;
    }
}
