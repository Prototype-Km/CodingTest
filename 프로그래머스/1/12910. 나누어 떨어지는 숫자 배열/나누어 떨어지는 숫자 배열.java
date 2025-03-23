import java.util.*;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
     int[] result=Arrays.stream(arr)
            .filter((n) -> n % divisor == 0)
            .sorted()
            .toArray();

    // 결과가 없으면 {-1} 반환
    if(result.length == 0){
        result = new int[]{-1};
    }
        return result;
    }
}