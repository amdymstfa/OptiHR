package com.optihr;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.optihr.util.CustomProperties;

@Data
@SpringBootApplication
public class OptiHrApplication implements CommandLineRunner {
    @Autowired
    private CustomProperties properties ;

	public static void main(String[] args) {
		SpringApplication.run(OptiHrApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println(properties.getApiUrl());
    }
}
