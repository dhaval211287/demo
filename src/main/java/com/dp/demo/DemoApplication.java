package com.dp.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.dp.demo.factory.EnemyShip;
import com.dp.demo.factory.EnemyShipFactory;
import com.dp.demo.factory.EnemyShipService;
import com.dp.demo.factory.RoketEnemyShip;
import com.dp.demo.factory.UFOEnemyShip;

@ComponentScan("com.dp.*")
@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		
	}
	


}
