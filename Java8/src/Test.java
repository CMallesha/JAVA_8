
public class Test {
public static void main(String[] args) {
	
	// Fruite f=new Fruite()         //cte
	
	Fruite f=new Apple();   //upcasting
	
	f.wash();       
	
//	f.makeJuice();        //not possible but use downcast
	((Apple)f).makeJuice();
	
	f.fee();
	
	Apple a=new Apple();
	a.makeJuice();
	
	a.fee();
}
}
