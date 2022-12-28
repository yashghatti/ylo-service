package ca.ylo.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class YloWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YloWebServiceApplication.class, args);
	}

}
