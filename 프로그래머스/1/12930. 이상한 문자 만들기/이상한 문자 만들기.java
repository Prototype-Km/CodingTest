import java.util.*;
class Solution {
    public String solution(String s) {
   
        StringBuilder ans = new StringBuilder();
        String[] str = s.split(" ",-1);
        
        for(int i=0;i<str.length;i++){
            for(int j=0; j<str[i].length(); j++){
                char c = str[i].charAt(j);                
                if( j % 2 ==0 ){
                    ans.append(Character.toUpperCase(c));
                }else{
                    ans.append(Character.toLowerCase(c));
                }
            }
              
            if (i != str.length - 1) {
                ans.append(" ");
            }
        }
        
        return ans.toString();
    }
}