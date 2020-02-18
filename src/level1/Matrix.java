package level1;

// 2차원 배열
class Matrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int row = Math.max(arr1.length, arr2.length);
		int col = Math.max(arr1[0].length, arr2[0].length);
		int[][] answer = new int[row][col];
		for (int i = 0; i < arr1.length; i++) { // 행에 대한 반복
			for (int j = 0; j < arr1[i].length; j++) { // 열에 대한 반복
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
