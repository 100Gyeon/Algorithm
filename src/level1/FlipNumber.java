package level1;

public class FlipNumber {
	// String, StringBuffer Ȱ�� ����
	public int[] solution(long n) {
		int[] answer = {};
		String num = Long.toString(n); // long�� �ڿ����� String���� ��ȯ
		StringBuffer sb = new StringBuffer(num); // StringBuffer Ŭ������ ���ڿ��� ���� �پ��� ������ �� �� �ִ� �޼ҵ带 ����
		sb = sb.reverse(); // StringBuffer ���� ���ڵ��� �ݴ� ������ ����
		String[] sArray = sb.toString().split(""); // ""�� ��ġ�ϴ� �κ��� �߽����� ��Ʈ���� �и��ϰ�, �и��� ��Ʈ������ �迭�� �����Ͽ� ����
		answer = new int[sArray.length];
		for (int i = 0; i < sArray.length; i++) {
			answer[i] = Integer.parseInt(sArray[i]);
		}
		return answer;
	}
}
