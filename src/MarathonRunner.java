import java.util.Arrays;

class MarathonRunner {
    public String solution(String[] participant, String[] completion) {
        // �������� ���� : Arrays.sort(�迭 �̸�) ���
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        // ������ �迭�� �����߱� ������ ������ index���� ���� ������ �ٸ��� ���ϸ� �ȴ�.
        // ���� 2�� for���� �� �ʿ䰡 ����.
        // String�� equals() �޼ҵ�� ���ڿ��� ������ ��
        for (i=0 ; i < completion.length ; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}
