package IntviewQuestiononvariableAcces;

public interface College {
	int km=10;

	default void fee() {
		System.out.println("50k");
		System.out.println(km);
	}
	
	static void Location() {
		System.out.println("Mysore");
		System.out.println(km);
	}
}

class AIT implements College{
	 
	void area() {
		System.out.println("fghjk");
	}
}

class Main{
	public static void main(String[] args) {
		
		College c=new AIT();
		c.fee();                    //default method calling
		College.Location();        //static method calling
	}
}


//WE CAN ACCES THE INTERFACE VARIABLE INSIDE THE DEFAULT, STATIC, 
//PRIVATE AND PRIVATE STATIC METHOD ALSO
