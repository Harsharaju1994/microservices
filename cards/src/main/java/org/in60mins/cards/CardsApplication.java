package org.in60mins.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("org.in60mins.cards.controller") })
@EnableJpaRepositories("org.in60minss.cards.repository")
@EntityScan("org.in60mins.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "In60minsBank Cards microservice REST API Documentation",
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
				description = "In60minsBank Cards microservice REST API Documentation",
				url = "https://www.in60mins.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
