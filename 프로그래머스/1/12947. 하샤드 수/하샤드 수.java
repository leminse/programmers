class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        
        
        while(x > 0){
            sum += x % 10;
            x = x / 10;
            // x / 10을 해서 뒷자리 없애기
        }
        
        if(a % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}