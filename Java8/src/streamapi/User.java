package streamapi;

import java.util.stream.Stream;

public class User {

	String name;
	int age;
	
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User Nmae: "+this.name+" Age: "+this.age;
	}
}

class UserTest{
	public static void main(String[] args) {
		
		User u1=new User("kiran",10);
		User u2=new User("varun",20);
		User u3=new User("arun",30);
		User u4=new User("kavya",40);
		
		
		Stream<User> st=Stream.of(u1,u2,u3,u4);
		
		st.filter(k-> k.name.startsWith("k") && k.age>15).forEach(System.out::println);
		
	}
}
