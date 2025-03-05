import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            answer += n % 10;
            // n을 10으로 나눈 나머지 값을 더함.
            n = n / 10;
            //마지막 자리 숫자를 제거 (123 -> 12)
        }

        return answer;
    }
}