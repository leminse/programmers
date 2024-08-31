class Solution {
    public int solution(int angle) {
        int answer = 0;
        for(int i = 0; i<= angle; i++){
            if(i>0 && i<90){
                answer = 1;
            }
            else if(i==90){
                answer = 2;
            }
            else if(i>90 && i<180){
                answer = 3;
            }
            else if(i==180){
                answer = 4;
            }
        }
        return answer;
    }
}