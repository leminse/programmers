class Solution {
    public String solution(String s) {
        String answer = "";
        boolean a = true;
        
        String[] arr = s.toLowerCase().split("");
        for(String str : arr){
            answer += a ? str.toUpperCase() : str;
            a = str.equals(" ") ? true : false;
        }
        
        return answer;
    }
}