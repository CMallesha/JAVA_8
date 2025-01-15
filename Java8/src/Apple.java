
public class Apple implements Fruite{

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("Fruite Washed!");
		
	}
	
//	public void fee() {                         //dont use the default keyword while overriding
//		System.out.println("per kg 10$");       //this method only invoke if you cant comment
//	}
	
	
	
	void makeJuice() {
		System.out.println("Juice ready!");
	}
	

}
