package br.com.tiagopedroso.resth2databaseserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestH2DatabaseServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestH2DatabaseServerApplication.class, args);
		System.out.println("\nNow the RestH2DatabaseServer is running ;)\n");
	}

}
