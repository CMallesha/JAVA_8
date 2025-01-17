package predicate.intrface;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=i-> i>10;
				//predicate interface present in java.util.function
		        //It gives true or false
				
		System.out.println(p.test(15));
		System.out.println(p.test(5));
	}

}
