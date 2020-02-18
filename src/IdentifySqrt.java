
public class IdentifySqrt {
	public long solution(long n) {
		long answer = 0;
		for(long x=1 ; x*x <= n ; x++){
			if(x*x % n == 0)
				answer = (x+1)*(x+1);
			else
				answer = -1;
		}
		return answer;
	}
}

/* Math 클래스의 메소드로 해결할 수도 있다.
 * public long solution(long n) {
 * 	long sqrt = (long)Math.sqrt(n);
 * 	if(Math.pow(sqrt, 2) == n)
 * 		return (long)Math.pow(sqrt+1, 2);
 * 	return -1;
 * }
 */
