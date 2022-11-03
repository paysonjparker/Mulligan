package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.gcu"})
public class MulliganApplication {

	public static void main(String[] args) {
		SpringApplication.run(MulliganApplication.class, args);
	}

}
