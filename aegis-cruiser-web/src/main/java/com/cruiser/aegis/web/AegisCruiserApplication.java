package com.cruiser.aegis.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.cruiser.aegis.repository"})
@ComponentScan(basePackages = {"com.cruiser.aegis"})
public class AegisCruiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AegisCruiserApplication.class, args);
	}

}
