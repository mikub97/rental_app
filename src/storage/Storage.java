package storage;


import model.Rental;
import model.User;
import java.io.*;
import java.util.*;

public class Storage implements Serializable {
	private static final long serialVersionUID = 1234L;
	public Map<String, Long> stock;
	public List<Rental> rentals ;
	public List<User> users;

	public Storage() {
		stock = new HashMap<>();
		rentals = new ArrayList<>();  // Arraylist extends List
		users = new ArrayList<>();
	}
}
