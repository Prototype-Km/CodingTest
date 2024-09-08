import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M; 
	static int[] NArray; 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		NArray = new int[N]; 
		
		StringTokenizer st= new StringTokenizer(br.readLine()); 
		
		for(int i=0; i < N; i++) {
			NArray[i] =Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(NArray); 
		
		 M = Integer.parseInt(br.readLine()); 
		 
		 st = new StringTokenizer(br.readLine());
		
		 for(int i=0; i<M; i++) {
			 int num = Integer.parseInt(st.nextToken());
			 
			 bw.write(BinarySearch(num) + " ");
		 }
		 br.close();
		 bw.flush();
		 bw.close();
	}

	public static int BinarySearch(int num) {
		int left = 0; 
		int right =  N-1; 
		
		while(left<=right) { 
			int middle = (left + right) /2; 
			int middleValue = NArray[middle];
			
			if(num > middleValue) { 
				left = middle + 1; 
			}else if(num < middleValue) { 
				right = middle -1;
			}else return 1; 
		}
			
		return 0;  
	}
	
	
}
	