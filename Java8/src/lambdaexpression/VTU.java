package lambdaexpression;

//public interface VTU {
//
//	public double fee(double fe);
//}
//
//class Interface_Demo {                              //no need to impl the interface
//	public static void main(String[] args) {
//		
//		VTU v=(fe)->{                              //lhs need t assign the interface reference
//			return fe+100;
//		};
//		
//		System.out.println("fee amt = "+v.fee(100.00));
//	}
//}






//public interface VTU {
//
//	public void display(String name);
//}
//
//class Interface_Demo {                              //no need to impl the interface
//	public static void main(String[] args) {
//		
//		VTU v=(name)->{                              //lhs need t assign the interface reference that to functional interface
//			System.out.println("name = "+name);
//		};
//		
//		v.display("Mallesh");
//	}
//}




// public interface VTU{
//	 
//	 public double fee(int placement_fee, double govt_fee);
// }
// 
// class Vtu_interface_demo{
//	 public static void main(String[] args) {
//		
//		 VTU v=(a,b)->{
//			 return a+b;
//		 };
//		 
//		 System.out.println("Total fee : "+v.fee(5000, 42000.00));
//	}
// }





@FunctionalInterface
public interface VTU{
	void show();
//	void add();   //CTE
}

class INteface_demo implements VTU{

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to VTU");
		
	}
	
	public static void main(String[] args) {
		
		VTU v=new INteface_demo();
		v.show();
		
		VTU vv=()->System.out.println("AIT");
		vv.show();
	}
	
}
