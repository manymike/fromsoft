package dsgame;

public class Weapon {

	String name;
	int damage;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Weapon(String name, int damage, int id) {
		super();
		this.name = name;
		this.damage = damage;
		this.id = id;
	}
	
	
	
}
