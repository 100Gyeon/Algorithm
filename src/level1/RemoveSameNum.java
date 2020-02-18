package level1;

// ArrayList<E> 명품자바프로그래밍 405쪽
// add() : index 위치에 요소 삽입
// get() : index에 해당하는 요소 리턴
// size() : ArrayList 요소의 개수 리턴

import java.util.*;

public class RemoveSameNum {
	public int[] solution(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(arr[0]); // 첫 번째 원소는 무조건 삽입 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) { // 연속적으로 나타나는 숫자 있는지 확인
				al.add(arr[i]); // 없으면 추가
			}
		}
		int[] answer = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i); // al의 i번째 요소를 리턴받아 answer 배열에 삽입
		}

		return answer;
	}
}
