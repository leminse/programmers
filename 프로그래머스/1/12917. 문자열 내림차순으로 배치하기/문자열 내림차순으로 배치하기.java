import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        // 내림차순 함수 : reveresOrder()
        for(String i : arr){
            answer += i;
        }
        
        return answer;
    }
}