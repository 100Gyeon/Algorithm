package level1;

// 2���� �迭
class Matrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int row = Math.max(arr1.length, arr2.length);
		int col = Math.max(arr1[0].length, arr2[0].length);
		int[][] answer = new int[row][col];
		for (int i = 0; i < arr1.length; i++) { // �࿡ ���� �ݺ�
			for (int j = 0; j < arr1[i].length; j++) { // ���� ���� �ݺ�
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
