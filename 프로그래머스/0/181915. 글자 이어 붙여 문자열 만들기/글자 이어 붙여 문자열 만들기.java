class Solution {
    public String solution(String my_string, int[] index_list) {
     // String answer = "";
        //index 길이만큼 돌고 , 그 인덱스의 값이 myString인덱스값 가져오기 
        // for(int i=0; i<index_list.length; i++){
        //     answer += my_string.charAt(index_list[i]);
        // }
        // return answer;
        StringBuilder sb = new StringBuilder();
        for(int idx : index_list){
            sb.append(my_string.charAt(idx));
        }
        return sb.toString();
    }
}
