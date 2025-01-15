package java9;

public interface VTU_Mysure {

	int tot_brch=10;
	
	default void Cs() {
		System.out.println("80k");
		System.out.println(tot_brch);
		Drives_count();
		Drives_count1();
		
	}
	
	static void Location() {
		System.out.println("Mysire");
		System.out.println(tot_brch);
//		Drives_count();                                               //not able to call private method
		Drives_count1();
	}
	
	//java 9
	private void Drives_count() {                                         //private methods
		System.out.println("20 drives conduxted in 2023");
	}
         
	private static void Drives_count1() {                                //private static method
		System.out.println("24 drives conduxted in 2024");
	}
}

class Mysore implements VTU_Mysure{
	
}

class Demo4{
	public static void main(String[] args) {
		VTU_Mysure v=new Mysore();
		v.Cs();
//		v.Location //cte
		VTU_Mysure.Location();
		
//		v.Drives_count();  //cte
		
		
	}
}
