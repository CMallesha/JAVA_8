package defaultmethod;

public interface PS {
	
	public default void Fee() {          //if you remove defalut here it shows complile time error and treated as abstract method
		System.out.println("50K");
	}

}
class PreSpace implements PS{
	
	public void Fee() {                 //default method can be override in  impl class here dont use the default keyword
		System.out.println("100K");
	}    //this method only invoke if you cant comment
	
	public void Location() {               //class specific method
		System.out.println("Mysure");
	}
}

class Test{
	public static void main(String[] args) {
//		Ps p=new PS();   //CTE
		
		PS p=new PreSpace();   //upcastig
		p.Fee();               //default method calling with interface reference
		
//		p.Location             //not posiible bcz no method in interface so do down casting
		
		((PreSpace)p).Location();  
		
		PreSpace ps=new PreSpace();  //directlty class obj creation
		ps.Fee();                    //default method calling with class reference variable
		 
	}
}
