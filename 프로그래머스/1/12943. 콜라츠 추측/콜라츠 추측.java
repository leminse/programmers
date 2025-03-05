class Solution {
    public int solution(long num) {
        // 625331 * 3을 하면 숫자가 너무 커지므로 long로 변환
        int answer = 0;
        
        while (num != 1) {
            
            if (answer >= 500) {
                return -1;  
            }
            
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }

        return answer;
    }
}