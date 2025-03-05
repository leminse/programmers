class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
            // 1부터 3직전 즉 2까지
        }else{
            answer = s.substring(s.length()/2, s.length()/2+1);
            // 2부터 3직전 즉 2까지
        }
        
        return answer;
    }
}