package level1;

public class PrimeNumber {
    public int solution(int n) {
    	int answer = 0; // 소수의 개수를 세기 위한 변수
    	
        int[] prime = new int[n]; // 소수를 저장할 배열
        boolean[] check = new boolean[n+1]; // false가 소수
        
        for(int i=2; i<=n; i++) { // 소수가 2부터 시작하니까 i도 2부터 시작
        	if(check[i] == false) {
        		prime[answer] = i; // 수를 2부터 차례대로 배열에 쓴 상태로 시작
        		answer++;
        	}
        	
        	// 오버플로우를 방지하기 위해서 j의 type은 long
        	// 에라토스테네스의 체를 이용해 1~n 범위의 소수를 구하면,   
        	// 루트 n 이하의 배수까지만 지우면 되기 때문에 i*i로 i의 배수를 지운다. 
        	for(long j=(long)i*i; j<=n ; j+=i) {
        		check[(int)j] = true;
            }
        }
        return answer;
    }
}