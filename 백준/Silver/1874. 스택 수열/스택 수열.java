import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//수열의 갯수 
		int n = sc.nextInt();
		//배열
		int[] a = new int[n];
		
		//입력 받기 
		for(int i=0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		Stack<Integer> stack = new Stack<>();
		int num = 1; // 오름차순 기준 
		
		for(int i=0; i<a.length;i++) {
			int su =a[i]; //수열에 있는 값 차례로 가져오기
			if(su >= num) {
				while(su>=num) {
					stack.push(num++); //넣어주고 ++
					bf.append("+\n"); //+ 출력
				}
				//마지막 값 pop해주기 
				stack.pop();
				bf.append("-\n");
			}else {
				int s = stack.pop();
				if( s > su) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
	}
}