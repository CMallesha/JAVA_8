package staticmethod;

public interface PS {

	static void placement() {
		System.out.println("Trust the Process!");
	}
}

class PentagonSpace implements PS {

	static void placement() {
		System.out.println("Don't worry abt result");
	}
}

class Test {

	public static void main(String[] args) {
		
		PS p=new PentagonSpace();
//		p.placement();     //not possible to call static methods 
		PS.placement();
		
		PentagonSpace ps=new PentagonSpace();
		ps.placement();
	}
}



//defult method can be overriden 
//static method cant be overrridden but method hiding 
