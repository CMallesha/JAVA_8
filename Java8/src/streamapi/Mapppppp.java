package streamapi;

import java.util.Arrays;
import java.util.List;

public class Mapppppp {
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("kiram", "karthik", "arun", "varun");
		
		names.stream().map(k-> k.toUpperCase()).forEach(System.out::println);
		System.out.println("==================================");
		
		names.stream().mapToInt(k-> k.length()).forEach(System.out::println);
		names.stream().filter(M-> M.startsWith("a")).map(k-> k.toUpperCase()).forEach(System.out::println);
		
		
		//Print emp name with emp age whose sal>10k using stream API
		
	}

}
