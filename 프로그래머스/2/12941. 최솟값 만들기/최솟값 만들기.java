import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int i = 0;
        int j = B.length - 1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        while(i < A.length && j >= 0){
            answer += A[i] * B[j];
            i++; j--;
        }

        return answer;
    }
}