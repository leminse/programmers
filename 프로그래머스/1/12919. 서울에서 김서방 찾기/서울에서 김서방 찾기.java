class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                // equals() : 문자열 비교에서 사용, 두 문자열이 정확히 일치하는지 확인한다.
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}