package com.lti.beans;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="APPLICATIONSTATUS")
public class ApplicationStatus {

	@Id
	@Column(name="APPLICATIONID", length = 20)
	private String applicationId;
	
	@Column(name="APPOINTMENTDATE", length=15)
	private String appointmentDate;
	
	@Column(name="STATUS",length=20)
	private String status="PENDING";
	
	@OneToOne
	@JoinColumn(name="USERID")
	private User user;
	
	public ApplicationStatus() {
		super();
	}
	public String getApplicationid() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}

