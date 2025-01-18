package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapIntview {
	
	private String name;
	private String Phone;
	private List<String> email;
		
	
	public FlatMapIntview(String name, String phone, List<String> email) {
		super();
		this.name = name;
		Phone = phone;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	
	public static void main(String[] args) {
		
		List<FlatMapIntview> u=Stream.of(new FlatMapIntview("ABC", "123", 
				Arrays.asList("mallesh@ga,mil.com", "mallsh@ga,mil.com")),
				
				new FlatMapIntview("AC", "1233", 
						Arrays.asList("mallh@ga,mil.com", "mash@ga,mil.com"))).collect(Collectors.toList());
		
		List<String> pno=u.stream().map(FlatMapIntview::getPhone).collect(Collectors.toList());
		System.out.println(pno);
		
		List<List<String>> em=u.stream().map(FlatMapIntview::getEmail).collect(Collectors.toList());
		System.out.println(em);
		
		List<String> email=u.stream().flatMap(k1-> k1.getEmail().stream()).collect(Collectors.toList());
		System.out.println(email);
		
		
	}
	
}
