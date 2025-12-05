package test.hr.dreactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DreactorApplication {
	public static void main(String[] args) {
        System.out.println("Small change");
		SpringApplication.run(DreactorApplication.class, args);
	}
}
