
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); //영수증 총 금액 26000
		
		int N = sc.nextInt(); //물건 종류 갯수
		//배열
		int[] a = new int[N];
		int[] b = new int[N];
		int sum=0;
		
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<N;i++) {
			int s = a[i];
			int c = b[i];
			int amount = s*c;
			sum += amount;
		}
		if(sum == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
