package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flat_map {
	
	public static void main(String[] args) {
		
		List<String> lang=Arrays.asList("C#","python","java");
		List<String> ftech=Arrays.asList("html","css","js");
		List<List<String>> develper=Arrays.asList(lang,ftech);
		develper.stream().forEach(System.out::println);   //display list of streams
		
		
		Stream<String> s1=develper.stream().flatMap(s-> s.stream());
		s1.forEach(System.out::println);                  //dispaly the single stream 
		
		
		
	}

}
