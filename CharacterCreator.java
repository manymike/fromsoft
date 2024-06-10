package dsgame;

public class CharacterCreator {

	public static void main(String[] args) {

		PlayerCharacter playerChar = new PlayerCharacter(100, 3, 0);
		System.out.println(playerChar.getHp());
		System.out.println(playerChar.getArmor());
		System.out.println(playerChar.getLoad());
	}

}
