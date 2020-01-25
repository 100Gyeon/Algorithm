
class HarshadNumber {
	public boolean solution(int x) {
		boolean answer = true;
		String[] number = Integer.toString(x).split("");
		int sum = 0;
		for(String s : number){
			sum += Integer.parseInt(s);
		}
		if(x % sum != 0) answer = false;
		return answer;
	}
}
