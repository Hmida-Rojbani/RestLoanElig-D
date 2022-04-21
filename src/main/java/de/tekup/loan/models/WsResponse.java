package de.tekup.loan.models;

import java.util.List;

import lombok.Data;

@Data
public class WsResponse {
	
	private boolean isEligible;
	private long approvedAmount;
	private List<String> criteriaMismatch;

}
