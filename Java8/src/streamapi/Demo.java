package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
//		Stream<Integer> st=Stream.of(10,20,2,5,19);
//		st.forEach(System.out::println); 
//		
//		System.out.println("==========================");
//		st.sorted().forEach(System.out::println);
		
		
	
	
//		STREAM METHOD
//		ArrayList<String> al=new ArrayList<>();
//		al.add("kiran");
//		al.add("varun");
//		al.add("arun");
//		
//		System.out.println("==================");
//		Stream<String> sl=al.stream();
//		sl.forEach(System.out::println);
		
		
		
		
//		FILTER METHOD
	List<Integer> al=Arrays.asList(10,2,3,19,28);
	al.stream().filter(k-> k>10).forEach((System.out::println));
		
	
	}
}
