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
@Table( name="LOANACCOUNTS")
public class LoanAccount {
	
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCNO")
	private int accNo;
	
	@Column(name="BALANCE")
	private double balance;
	
	@OneToOne
	@JoinColumn(name="USERID")
    private User user;
	
	
	
	
	public LoanAccount(int accNo, double balance, User user) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.user = user;
	}

	public LoanAccount() {
		super();
	}

	public int getAccno() {
		return accNo;
	}
	public void setAccno(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "LoanAccount [accNo=" + accNo + ", balance=" + balance + ", user=" + user + "]";
	}
	
	

	
	

}
