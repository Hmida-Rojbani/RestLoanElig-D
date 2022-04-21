package de.tekup.loan.ctrls;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.loan.models.CustomerRequest;
import de.tekup.loan.models.WsResponse;
import de.tekup.loan.services.LoanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class LoanRestCtrl {
	private LoanService service;
	
	@Operation(summary = "Is to check if a customer is eligible for a credit")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200",description = "Status client is checked",
			content = {@Content(mediaType = "application/json"),
					@Content(mediaType = "application/xml")}),
			@ApiResponse(responseCode = "400",description = "Not yet Implimented")
			})
	@PostMapping(path="/check/client/status",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public WsResponse checkClientStatus(@RequestBody CustomerRequest request) {
		return service.getLoanStatus(request);
	}

}
