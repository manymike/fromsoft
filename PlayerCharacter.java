package dsgame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class PlayerCharacter {

	int load;
	String name;
	int hp;
	int armor;
	int attack; //only one weapon can be equipped at a time so just tie to weap atk value


	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public PlayerCharacter( int hp, int armor, int load) {
		super();
		this.hp = hp;
		this.armor = armor;
		this.load = load;
	}

	public PlayerCharacter() {

	}

	public void addToInventory(Weapon weapon) {
		Engine.inventory.add(weapon.getId());
	}



	public static void equipWeapon() {

		HashMap<Integer, Weapon> weapons = new HashMap<Integer, Weapon>();
		int choice;
		Scanner scanner = new Scanner(System.in);
		int index = 1;
		System.out.println("Choose a weapon to equip");
		for (int i = 0; i < Engine.inventory.size(); i++) {
			int itemId = Engine.inventory.get(i);
			for (Weapon weapon : Engine.weapon) {
				if (weapon.getId() == itemId) {
					System.out.printf("%d. %s \n",index,weapon.getName());
					weapons.put(index, weapon);
					index++;
				}

			} 


		} choice = scanner.nextInt();

		for(Integer key : weapons.keySet()) {
			if(key.intValue()==choice) {
				Engine.player.setAttack(weapons.get(key).getDamage());
			}
		}
	}

}


