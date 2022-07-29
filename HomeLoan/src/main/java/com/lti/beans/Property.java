package com.lti.beans;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTYS")
public class Property {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PROPERTYID")
	private int propertyId;
	
	@Column(name="PROPERTYNAME",length=30)
	private String propertyName;
	
	@Column(name="PROPERTYLOCATION",length=30)
	private String propertyLocation;
	
	@Column(name="AMOUNT",length=30)
	private double amount;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USERID")
	private User user;

	public Property(int propertyId, String propertyName, String propertyLocation, double amount, User user) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.propertyLocation = propertyLocation;
		this.amount = amount;
		this.user = user;
	}

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", propertyName=" + propertyName + ", propertyLocation="
				+ propertyLocation + ", amount=" + amount + ", user=" + user + "]";
	}
	

}