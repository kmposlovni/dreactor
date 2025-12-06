package test.hr.dreactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DreactorApplication {
	public static void main(String[] args) {
        System.out.println("Will this trigger image build?");
		SpringApplication.run(DreactorApplication.class, args);
	}
}
