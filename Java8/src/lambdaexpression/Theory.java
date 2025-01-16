package lambdaexpression;

public class Theory {
	
//	Lambda Expression
	
//	1.saves lot of code (less code more efficiency)
//	2.to provide impl for the functional interface
//	3.we dont need to define the method again to provide the impl
//	4.it helps to iterate, filter, and extratct dtat from the collection
//	5.lambda is an anonynous function
//	6.it has no return type, acces modifier
	
	
	public static void main(String[] args) {
		
	
	
	public void fee() {
		System.out.println("50K");
	}
	
//	the same can be wrtten as
	
	()->{System.out.println("50K")};
	
//	also
	
	()->System.out.println("50K");
	
	//parameterised
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
//	same
	
	(int a int b)->{System.out.println(a+b)};
//	or
	(int a int b)->System.out.println(a+b);
//	or
	(a,b)->sop(a+b);
	

}
}
