package dsgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
	
	
	static ArrayList<Enemy> enemy = new ArrayList<Enemy>();
	static ArrayList<Weapon> weapon = new ArrayList<Weapon>();
	static ArrayList<Integer> inventory = new ArrayList<Integer>();
	
	static Enemy enemy0 = new Enemy("Skeleton", 0, 50, 0);
	static PlayerCharacter player = new PlayerCharacter();
	static Weapon weapon0 = new Weapon("Unarmed",1, 0);
	static Weapon weapon1 = new Weapon("Broken Dagger",2, 1);
	static Weapon weapon2 = new Weapon("Longsword",5, 2);
	
	static Scanner scanner = new Scanner(System.in);
	
	static EncounterSquare es1 = new EncounterSquare(enemy0, enemy0, enemy0);
	
	public static void setEnemies()	{
		enemy.add(enemy0);
	}
	
	public static void setWeapons() {
		weapon.add(weapon0);
		weapon.add(weapon1);
		weapon.add(weapon2);
	}
	
	public static void setInventory() {
		inventory.add(0);
		inventory.add(1);
		inventory.add(2);
	}
	
	public static void main(String[] args)	{
		
	System.out.println("Enter your name");
	
	String playerName = scanner.next();
	
	player.setName(playerName);
	setWeapons();
	setInventory();
	
	System.out.println(player.getName() + " created.");
		
	PlayerCharacter.equipWeapon();
	
	System.out.printf("Attack power is %d \n" , player.getAttack());
	
	Gameplay.playerAttack(player, enemy0);
		
	}
	
	

}
