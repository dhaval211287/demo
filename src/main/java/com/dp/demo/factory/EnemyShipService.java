package com.dp.demo.factory;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class EnemyShipService {
	
		
	EnemyShipFactory shipfactory = new EnemyShipFactory();
	
	EnemyShip ship = null;
	
	Scanner userinput = new Scanner(System.in);
	
	String enemyShipOption = "";
	
	public void buildShip(String type) {
	 
		ship = shipfactory.makeEnemyShip(type);
	
	
	if (ship != null) {
	    doStuff(ship);
	}else {
		System.out.println("invalid option select B,U or R");
	}
	

	}
	
	public static void doStuff(EnemyShip ship) {
		ship.displayEnemyShip();
		ship.enemyShipShoots();
		ship.followHeroShip();
	}

}
