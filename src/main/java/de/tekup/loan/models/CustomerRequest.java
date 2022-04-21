package de.tekup.loan.models;

import lombok.Data;

@Data
public class CustomerRequest {
	
	private String customerName;
	private int age;
	private long yearlyIncome;
	private int cibilScore;
	private String employmentMode;

}
