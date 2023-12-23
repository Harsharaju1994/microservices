package org.in60mins.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("org.in60mins.loans.controller") })
@EnableJpaRepositories("org.in60mins.loans.repository")
@EntityScan("org.in60mins.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "In60minsBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "RajaGopal Reddy",
						email = "tutor@in60mins.com",
						url = "https://www.in60mins.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.in60mins.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "In60minsBank Loans microservice REST API Documentation",
				url = "https://www.in60mins.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
