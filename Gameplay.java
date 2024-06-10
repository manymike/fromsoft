package dsgame;

public class Gameplay {
	
	public static void playerAttack(PlayerCharacter playerCharacter, Enemy enemy) {
		int newHp = enemy.getHp()-playerCharacter.getAttack(); 
		enemy.setHp(newHp);
		System.out.printf("%s 's hp now %d", enemy.getName(), enemy.getHp());
	}
	

}
