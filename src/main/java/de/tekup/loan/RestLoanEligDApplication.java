package de.tekup.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPI31;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Loan Eligibility Indocator"
,description = "A Service to test credit eligibilty",
contact = @Contact(name = "Hmida ROJBANI", email = "hmida.rojbani@tek-up.tn")))
public class RestLoanEligDApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestLoanEligDApplication.class, args);
	}

}
