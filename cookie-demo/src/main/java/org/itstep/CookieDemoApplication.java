package org.itstep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CookieDemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(CookieDemoApplication.class);
		springApplication.run(args);
	}

}
