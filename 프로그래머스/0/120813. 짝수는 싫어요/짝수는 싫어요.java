class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        //홀수 개수만큼의 배열의 크기 설정.
        int a = 0;
        
        for(int i = 0; i <= n; i++){
            if(i%2==1){                 
                //홀수 일 경우 배열에 추가
                answer[a] = i;
                a++;
                //a는 1씩 증가해주며 배열을 순회
            }
        }
        
        return answer;
    }
}