class Solution {
    public String solution(int a, int b) {
        String[] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        
        for(int i = 0; i < a - 1; i++) {
            sum += months[i];
        }
        sum += b;
        
        return answer[(sum + 4) % 7];
    }
}