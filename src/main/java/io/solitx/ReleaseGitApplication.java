package io.solitx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReleaseGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReleaseGitApplication.class, args);
		System.out.println("src code modified");
	}

}
