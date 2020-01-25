// 명품자바프로그래밍 136쪽, 353쪽, 354쪽
// 문자열 배열에 있는 모든 문자열을 for-each문으로 접근
// int -> String : Integer.toString(int형 숫자);
// String -> int : Integer.parseInt("문자열");

class HarshadNumber {
	public boolean solution(int x) {
		boolean answer = true;
		String[] number = Integer.toString(x).split("");
		int sum = 0;
		for(String s : number){ // 반복할 때마다 s는 number[0], number[1], ...로 설정
			sum += Integer.parseInt(s);
		}
		if(x % sum != 0) answer = false;
		return answer;
	}
}
