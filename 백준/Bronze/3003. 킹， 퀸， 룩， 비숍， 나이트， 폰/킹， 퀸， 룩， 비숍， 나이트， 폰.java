import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크고 10보다 작거나 
//		같은 정수이다.
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight= 2;
		int pawn = 8;
		
		Scanner sc = new Scanner(System.in);
		
		king = king - sc.nextInt();
		queen = queen- sc.nextInt();
		rook = rook - sc.nextInt();
		bishop = bishop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		System.out.print(king+" ");
		System.out.print(queen+" ");
		System.out.print(rook+" ");
		System.out.print(bishop+" ");
		System.out.print(knight+" ");
		System.out.print(pawn+"\n");
	}
}
