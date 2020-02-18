import java.util.Arrays;

class MarathonRunner {
    public String solution(String[] participant, String[] completion) {
        // 오름차순 정렬 : Arrays.sort(배열 이름) 사용
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        // 위에서 배열을 정렬했기 때문에 동일한 index끼리 값이 같은지 다른지 비교하면 된다.
        // 따라서 2중 for문을 쓸 필요가 없다.
        // String은 equals() 메소드로 문자열이 같은지 비교
        for (i=0 ; i < completion.length ; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}
