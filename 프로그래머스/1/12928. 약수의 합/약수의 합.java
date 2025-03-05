class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){    
            if(n%i==0){
                answer += i;
            }
            // n을 i로 나눈 나머지 값이 0일 때 i의 값을 더한다.
        }
        return answer;
    }
}