package main.java.coding;
import lombok.Data;



@Data
public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person() {}

	public Person(String firstName2, String lastName2) {
			this.firstName=firstName2;
			this.lastName=lastName2;
	
	}
	
	

}
