package com.dp.demo.factory;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType) {
		
		EnemyShip ship = null;
				
		if (newShipType.equals("U")) {
			
			return new UFOEnemyShip();
			
		}else if (newShipType.equals("R")) {
			
			return new RoketEnemyShip();
		
		}else if (newShipType.equals("B")) {
			
			return new BigUFOEnemyShip();
		}
		return null;
		
	}

}
