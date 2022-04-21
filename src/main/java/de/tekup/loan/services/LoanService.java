package de.tekup.loan.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import de.tekup.loan.models.CustomerRequest;
import de.tekup.loan.models.WsResponse;


@Service
public class LoanService {
	
	public WsResponse getLoanStatus(CustomerRequest customerRequest) {
		WsResponse response = new WsResponse() ;
		response.setCriteriaMismatch(new ArrayList<>());
		if(customerRequest.getAge() < 25 || customerRequest.getAge() > 50) {
			response.getCriteriaMismatch().add("Customer age must be between 25 and 50.");
		}
		if(customerRequest.getYearlyIncome() < 20000) {
			response.getCriteriaMismatch().add("Customer yearly income must be over 20000.");
		}
		if(customerRequest.getCibilScore() < 500) {
			response.getCriteriaMismatch().add("Customer cible score must be over 500.");
		}
		
		if(response.getCriteriaMismatch().isEmpty()) {
			response.setEligible(true);
			response.setApprovedAmount((long)((60-customerRequest.getAge())*customerRequest.getYearlyIncome()*0.4));
		}else {
			response.setEligible(false);
			response.setApprovedAmount(0);
		}
		
		return response;
	}

}
