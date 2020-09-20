package tn.fivepoints.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration

public class FivepointsWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FivepointsWebsiteApplication.class, args);
	}

}
