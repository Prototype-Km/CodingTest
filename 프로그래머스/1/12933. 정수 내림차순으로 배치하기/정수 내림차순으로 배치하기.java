import java.util.*;
class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        long result = 0;
        String answer = "";
        for(String s : str){
            answer += s;
        }
        result = Long.parseLong(answer);
        return result;
    }            
}