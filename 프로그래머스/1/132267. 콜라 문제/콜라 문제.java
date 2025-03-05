class Solution {
    public int solution(int a, int b, int n) {
        // a = 마트 빈 병, b = 콜라, n = 가지고 있는 빈 병
        int answer = 0;
        
        while(n >= a){
            int c = n % a;
            n = (n / a) * b;
            answer += n;
            n += c;
        }
        
        return answer;
    }
}