package com.qa.Luke.Montgomery.SakilaDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SakilaDb {

	public static void main( String[] args ) {
        SpringApplication.run(SakilaDb.class, args);
    }
}
