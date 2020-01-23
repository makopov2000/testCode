package com.example.unix;

import java.io.File;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.unix4j.Unix4j;
import org.unix4j.builder.Unix4jCommandBuilder;
import org.unix4j.line.Line;

@SpringBootApplication
public class UnixApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnixApplication.class, args);
		

	}

}
