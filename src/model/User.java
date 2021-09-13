package model;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private boolean restricted;
	private ArrayList<Rental> userRentals;

	public User( String username, String password, String firstName, String lastName, String email,boolean restricted) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email =email;
		this.userRentals = new ArrayList<>();
		this.restricted = restricted;
	}

}
