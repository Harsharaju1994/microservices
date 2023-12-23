package org.in60mins.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "In60minsBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "RajaGopal Reddy",
						email = "tutor@in60minss.com",
						url = "https://www.in60mins.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.in60mins.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "In60minsBank Accounts microservice REST API Documentation",
				url = "https://www.in60mins.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
