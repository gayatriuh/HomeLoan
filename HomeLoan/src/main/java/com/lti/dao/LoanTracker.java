package com.lti.dao;

import com.lti.beans.ApplicationStatus;

public interface LoanTracker {

	public ApplicationStatus trackLoan(String applicationId);
}
