import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            list.add(Integer.parseInt(arr[i]));
        }
        answer = Collections.min(list) + " " + Collections.max(list);
        
        return answer;
    }
}