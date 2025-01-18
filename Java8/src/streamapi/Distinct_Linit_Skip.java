package streamapi;

import java.util.Arrays;
import java.util.List;

public class Distinct_Linit_Skip {
	public static void main(String[] args) {
		
		List<String> lang=Arrays.asList("c","c++","java","python","python");
		lang.stream().limit(2).forEach(System.out::println);
		System.out.println("==============================");
		
		lang.stream().skip(2).forEach(System.out::println);
		System.out.println("==============================");
		
		lang.stream().distinct().forEach(System.out::println);
		System.out.println("=================================");
		
	}

}
