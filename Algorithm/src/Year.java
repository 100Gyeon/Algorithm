// 2월을 29일로 둔 해가 윤년
class Year {
	public String solution(int a, int b) {
		String answer = "";
		String[] dayofweek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		int[] date = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		
		for(int i=0 ; i<a ; i++) {
			sum += date[i];
		}
		
		return dayofweek[(sum + b) % 7]; // 혹은 아래의 주석으로도 실행 가능
		
		/*switch((sum + b) % 7) {
			case(0) :
				answer = dayofweek[0]; break;
			case(1) :
				answer = dayofweek[1]; break;
			case(2) :
				answer = dayofweek[2]; break;
			case(3) :
				answer = dayofweek[3]; break;
			case(4) :
				answer = dayofweek[4]; break;
			case(5) :
				answer = dayofweek[5]; break;
			case(6) :
				answer = dayofweek[6]; break;
		}
		return answer;*/
	}
}
