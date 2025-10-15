import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arNum[] = new int[9];
        int max = 0;
        int index = 0;

        for(int i=0; i<arNum.length;i++){
            arNum[i] = sc.nextInt();

            if(max < arNum[i]){
                max = arNum[i];
                index = i + 1;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(index);
    }
}
