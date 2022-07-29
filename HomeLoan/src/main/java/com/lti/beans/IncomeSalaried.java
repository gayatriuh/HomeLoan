package com.lti.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="INCOMESALARIEDS")
public class IncomeSalaried {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SRNO")
	private int srNo;
	
	@Column(name="RETIREMENTAGE")
	private int retirementAge;
	
	@Column(name="MONTHLYSALARY",length=50)
	private double monthlySalary;
	
	@Column(name="ORGANIZATION",length=50)
	private String organization;
	
    
	@OneToOne
	@JoinColumn(name="USERID")
	private User user;

	public IncomeSalaried() {
		super();
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "IncomeSalaried [srNo=" + srNo + ", retirementAge=" + retirementAge + ", monthlySalary=" + monthlySalary
				+ ", organization=" + organization + ", user=" + user + "]";
	}

	


	
	
}
