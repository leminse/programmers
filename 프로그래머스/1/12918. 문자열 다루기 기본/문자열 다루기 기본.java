class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() != 4 && s.length() != 6){
            return answer;
        }
        if(s.matches("[0-9]+")){
            // matches 정규표현식 (0부터 9까지 숫자가 있는 지 판별)
            return true;
        }
        
        
        return answer;
    }
}