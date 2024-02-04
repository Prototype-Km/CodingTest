class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        //flag->true면 a+b 
        // false면 a-b
        return flag ? a+b : a-b;
        
    }
}