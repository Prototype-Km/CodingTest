import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		
		List<Student> arlist = new ArrayList<>();
		
		
		//입력 
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			int month= Integer.parseInt(st.nextToken());
			int year= Integer.parseInt(st.nextToken());
			arlist.add(new Student(name, day, month, year));
		}
		
		//정렬 
		Collections.sort(arlist, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.year == o2.year) {
					if(o1.month == o2.month) {
						return Integer.compare(o1.day, o2.day);
					}else {
						return Integer.compare(o1.month, o2.month);
					}
				}
				return Integer.compare(o1.year, o2.year);
			}
		});
		
		System.out.println(arlist.get(arlist.size() - 1).getName());
		System.out.println(arlist.get(0).getName());
		
	}
}

class Student{
	String name;
	int day;
	int month;
	int year;

	public Student(String name, int day, int month, int year) {
		super();
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String getName() {
		return name;
	}
}

