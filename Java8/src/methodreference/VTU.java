package methodreference;

import java.util.ArrayList;
import java.util.List;

//refering one method from the another method is called method reference

//@FunctionalInterface
//public interface VTU {
//  void fee();
//}
//
//class Interface_demo{
//	public static void Location() {
//		System.out.println("fee=50K and Location=bnglr");
//	}
//	
//	public static void main(String[] args) {
//		
//		VTU v=Interface_demo::Location;
//		v.fee();
//	}
//}





public interface VTU {

}
class Interface_demo{
	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		list.add("Siddu");
		list.add("Mani");
		list.add("Gani");
		
		list.forEach(M->System.out.println(M));  //for each with lamda expn
		list.forEach(System.out::println);       //for each with method reference
	}
}
