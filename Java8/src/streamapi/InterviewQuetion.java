package streamapi;

import java.util.stream.Stream;

public class InterviewQuetion {

	//Print emp name with emp age whose sal>10k using stream API
	
	String name;
	int age;
	int sal;
	
	public InterviewQuetion(String name, int age, int sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name: "+this.name+" Age: "+this.age+" SAl: "+this.sal;
}
		
}

class IntImpl{
	public static void main(String[] args) {
		
		InterviewQuetion i=new InterviewQuetion("siddu", 18, 20000);
		InterviewQuetion i1=new InterviewQuetion("Mani", 18, 100);
		InterviewQuetion i2=new InterviewQuetion("Uday", 18, 500);
		
		Stream<InterviewQuetion> it=Stream.of(i,i1,i2);
		
		//with to string
		it.filter(k-> k.sal>10000).forEach(System.out::println);
		
		//without to string
		it.filter(k-> k.sal>10000).forEach(m-> System.out.println(m.name+"-"+m.age));
		
		//combo of map and filter
		it.filter(k-> k.sal>10000).map(k-> k.name+"-"+k.age).forEach(System.out::println);
	}
}