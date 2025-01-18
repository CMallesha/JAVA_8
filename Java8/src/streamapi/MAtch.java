package streamapi;

import java.util.Arrays;
import java.util.List;

public class MAtch {
	
	String author;
	String country;
	
	public MAtch(String author, String country) {
		super();
		this.author = author;
		this.country = country;
	}

	public static void main(String[] args) {
		MAtch m=new MAtch("kuvempu", "India");
		MAtch m1=new MAtch("kiran", "aus");
		MAtch m2=new MAtch("vidya", "japan");
		MAtch m3=new MAtch("Shakes", "US");
		
		List<MAtch> list=Arrays.asList(m,m1,m2,m3);
		boolean b1=list.stream().anyMatch(k-> k.country.equals("India"));
		System.out.println(b1);
		
		boolean b2=list.stream().allMatch(k-> k.country.equals("India"));
		System.out.println(b2);
		
		boolean b3=list.stream().noneMatch(k-> k.country.equals("India"));
		System.out.println(b3);
		
		
	}

}
