class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0){
            answer = n / 7;
        }
        else{
            answer = n / 7 + 1;
            /*7로 나누어지지 않는다는 것은 7보다 작은 값이라면 0일 테니 1을 더해주고 
            7보다 크다면 n이 남으므로 1 더해주기*/
        }
        return answer;
    }
}