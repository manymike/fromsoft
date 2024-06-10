package dsgame;

import java.util.ArrayList;

public class Enemy {
	
	static ArrayList<Enemy> enemy = new ArrayList<Enemy>();
	
	String name;
	int id;
	int hp;
	int armor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Enemy(String name, int id, int hp, int armor) {
		super();
		this.name = name;
		this.id = id;
		this.hp = hp;
		this.armor = armor;
	}


	
	
}
