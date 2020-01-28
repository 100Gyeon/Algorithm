
class CountSpecificCharacter {
	boolean solution(String s) {
		boolean answer = false;
        int count_p = 0;
        int count_y = 0;
        int length = s.length();
        for(int i=0 ; i < length ; i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                count_p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                count_y++;
        }
        if(count_p == count_y) 
        	answer = true;
        System.out.println("Hello Java");

        return answer;
    }
}
