class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        s = s.toLowerCase();
        // 대문자 소문자로 변환
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'p') 
                p++;
            else if(s.charAt(i) == 'y') 
                y++;
            //String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
        }
        
        if(p != y) 
            answer = false;

        return answer;
    }
}