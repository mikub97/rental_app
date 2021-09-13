package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Rental implements Serializable {
	
	private User user;
	private LocalDateTime rentDateTime;
	private LocalDateTime returnDateTime;
	private String itemName;
	private long itemQuantity;
	private boolean isReturned;
	 
	public Rental( User user, LocalDateTime rentDateTime, String itemName, long itemQuantity) {
		this.user = user;
		this.rentDateTime = rentDateTime;
		this.itemName = itemName;
		this.returnDateTime=null;
		this.isReturned = false;
		this.itemQuantity = itemQuantity;
	}
}
