package com.dp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dp.demo.factory.EnemyShip;
import com.dp.demo.factory.EnemyShipService;
import com.dp.demo.factory.UFOEnemyShip;

@RestController
public class DemoController {
	
	@Autowired
	EnemyShipService shipService;
	
	@Value("${my.value}")
	String val;
	
	@Value("${app.name}")
	private String app;
	
	@GetMapping("/hello")
	public String hello() {
		return val + app;
	}
	
	@PostMapping("/dostuff")
	public void doStuff(@RequestParam String type) {
		shipService.buildShip(type);
		
	}
	
	

}
