class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        
        String[] str = Integer.toString(x).split("");
        
        for (int i=0; i<str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        if( x % sum == 0){
            answer = true;
        }
        return answer;
    }
}
//x가 하샤드 수이려면 x의 
// 자릿수끼리 합 -> 원래 값 나누기 

