package level1;

// ArrayList<E> ��ǰ�ڹ����α׷��� 405��
// add() : index ��ġ�� ��� ����
// get() : index�� �ش��ϴ� ��� ����
// size() : ArrayList ����� ���� ����

import java.util.*;

public class RemoveSameNum {
	public int[] solution(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(arr[0]); // ù ��° ���Ҵ� ������ ���� 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) { // ���������� ��Ÿ���� ���� �ִ��� Ȯ��
				al.add(arr[i]); // ������ �߰�
			}
		}
		int[] answer = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i); // al�� i��° ��Ҹ� ���Ϲ޾� answer �迭�� ����
		}

		return answer;
	}
}
