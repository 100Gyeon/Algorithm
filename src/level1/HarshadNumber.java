// ��ǰ�ڹ����α׷��� 136��, 353��, 354��
// ���ڿ� �迭�� �ִ� ��� ���ڿ��� for-each������ ����
// int -> String : Integer.toString(int�� ����);
// String -> int : Integer.parseInt("���ڿ�");

package level1;

class HarshadNumber {
	public boolean solution(int x) {
		boolean answer = true;
		String[] number = Integer.toString(x).split("");
		int sum = 0;
		for (String s : number) { // �ݺ��� ������ s�� number[0], number[1], ...�� ����
			sum += Integer.parseInt(s);
		}
		if (x % sum != 0)
			answer = false;
		return answer;
	}
}

/* �ٸ� Ǯ��
* public boolean solution(int x) {
* 	int temp = x;
* 	int sum = 0;
* 	while(x != 0) {
* 		sum += x % 10;
* 		x /= 10;
* 	}
* 	return temp % sum == 0 ? true : false;
* }
*/