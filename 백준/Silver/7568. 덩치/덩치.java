import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
      public static void main(String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
          int N = Integer.parseInt(br.readLine());
          
          int[][] arr = new int[N][2];
          
          String[] st;
          for(int i=0; i<N; i++){
              st = br.readLine().split(" "); //문자열 분리 
              arr[i][0] = Integer.parseInt(st[0]); //몸무게
              arr[i][1] = Integer.parseInt(st[1]); //키 
          }
          
          for(int i=0; i<N; i++){
              int rank = 1;
              
              for(int j=0; j<N; j++){
                  if( i == j) continue;
                  if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                      rank++;
                  }
              }
              System.out.print(rank + " ");
          }
       }
}