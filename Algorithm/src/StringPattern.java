
class StringPattern {
  public String solution(int n) {
      String answer = "";
      for(int i=0; i<n ; i++){
          if(i%2 == 0)
        	  answer = answer + "��";
          else
        	  answer = answer + "��";
      }
      return answer;
  }
}