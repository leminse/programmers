class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        answer = "*".repeat(phone_number.length() -4) 
            + phone_number.substring(phone_number.length() -4);
        //뒤에 4자리 빼고 전부 *로 만든 뒤 뒤에 4자리를 가져온다.
        // repeat : 특정 문자열을 지정한 횟수만큼 반복해서 새로운 문자열을 만듬
        // substring : 문자열의 특정 부분을 가져온다.
        
        return answer;
    }
}