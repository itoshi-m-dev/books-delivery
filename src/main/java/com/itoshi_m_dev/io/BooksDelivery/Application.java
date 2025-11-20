package com.itoshi_m_dev.io.BooksDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        SpringApplicationBuilder app = new SpringApplicationBuilder(Application.class);
        app.run();

	}

}
