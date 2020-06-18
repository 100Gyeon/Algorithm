package level1;

public class PrimeNumber {
    public int solution(int n) {
    	int answer = 0; // �Ҽ��� ������ ���� ���� ����
    	
        int[] prime = new int[n]; // �Ҽ��� ������ �迭
        boolean[] check = new boolean[n+1]; // false�� �Ҽ�
        
        for(int i=2; i<=n; i++) { // �Ҽ��� 2���� �����ϴϱ� i�� 2���� ����
        	if(check[i] == false) {
        		prime[answer] = i; // ���� 2���� ���ʴ�� �迭�� �� ���·� ����
        		answer++;
        	}
        	
        	// �����÷ο츦 �����ϱ� ���ؼ� j�� type�� long
        	// �����佺�׳׽��� ü�� �̿��� 1~n ������ �Ҽ��� ���ϸ�,   
        	// ��Ʈ n ������ ��������� ����� �Ǳ� ������ i*i�� i�� ����� �����. 
        	for(long j=(long)i*i; j<=n ; j+=i) {
        		check[(int)j] = true;
            }
        }
        return answer;
    }
}