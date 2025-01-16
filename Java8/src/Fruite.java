
public interface Fruite {
	
	String name="apple";     //public  final String name="apple"
	void wash();             //public abstract void wash();
	
	public default void fee() {                             //if you remove defalut here it shows complile time error and treated as abstract method
		System.out.println("per kg 100$");
	}
	
	//default method can override in class impl there dont use the default

}


