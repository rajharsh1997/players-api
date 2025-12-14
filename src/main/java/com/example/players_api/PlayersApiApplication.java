package com.example.players_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayersApiApplication {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		//static
		System.out.println(Dog.getDogCount());
		Dog d1 = new Dog();
		// After creating c1, we can use the inherited getters and setters from Animal
		c1.setAge(0);
		d1.setName("Bruno");
		//Static
		System.out.println(Dog.getDogCount());
		System.out.println(d1.getDogCount());// This also works but is discouraged as it is confusing.
		SpringApplication.run(PlayersApiApplication.class, args);
	}

}
