package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Mulligan Application.
 * @author paysonparker
 *
 */
@SpringBootApplication
@ComponentScan({"com.gcu"})
public class MulliganApplication {

	/**
	 * Runs the application.
	 * @param args Args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MulliganApplication.class, args);
	}

}
