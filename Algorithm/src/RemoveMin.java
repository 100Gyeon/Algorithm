import java.util.ArrayList;
import java.util.Collections;

class RemoveMin {
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		Integer minimum = Collections.min(al);
		// Collections.min()으로 ArrayList의 최솟값을 얻는다.
		al.remove(minimum);
		int[] answer = new int[arr.length - 1];
		for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
		return answer;
	}
}
