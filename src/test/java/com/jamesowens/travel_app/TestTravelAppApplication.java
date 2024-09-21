package com.jamesowens.travel_app;

import org.springframework.boot.SpringApplication;

public class TestTravelAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(TravelAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
