import java.util.*;

public class Solution {
    public int solution(int n) {
        String empty = "";
        int sum = 0;
        String str = empty + n;

        String[] ar = str.split("");;
        
        for(int i=0; i<ar.length;i++){
            sum += Integer.parseInt(ar[i]); 
        }
        return sum;
    }
}