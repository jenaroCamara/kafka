package com.ejerciciospring.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicoApplication.class, args);
	}

}
///docker-compose -f zk-single-kafka-multiple-4.yml up -d
//docker-compose -f zk-single-kafka-multiple-4.yml down

