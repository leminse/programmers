class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(n + "").length()];
        int sum = 0;
        while(n != 0){
            answer[sum++] = (int)(n % 10);
            n = n / 10;
        }
        return answer;
    }
}