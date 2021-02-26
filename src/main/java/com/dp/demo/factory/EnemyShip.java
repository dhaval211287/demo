package com.dp.demo.factory;

import lombok.Data;

@Data
public abstract class EnemyShip {

	private String name;
	private double amtDamage;
	
	public void followHeroShip() {
		System.out.println(getName() + "Following the Hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + "is on the screan");
		}
	
	public void enemyShipShoots() {
		
		System.out.println(getName() + "attacks and does" + getAmtDamage());
		
	}
}
