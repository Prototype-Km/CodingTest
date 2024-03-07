import java.util.*;

public class Main{
    public static void main(String[] args){
        // 입력할 숫자의 갯수 cnt 
        // 빈칸없이 숫자 합해서 
        
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt(); //입력할 숫자의 갯수 
        int sum = 0; // 누적합  초기화 
        String sNum = sc.next(); // 사용자 입력 예) 54 -> 9
        char[] cNum = sNum.toCharArray(); //String을 char[] 로 변환
        
        for(int i=0; i<cNum.length;i++){
              sum += cNum[i] - 48;   //'0' -> 아스키코드로 48;
        }
        System.out.println(sum);
    }
}