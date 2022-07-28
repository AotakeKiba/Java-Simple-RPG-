import java.util.*;
public class Main {
	public boolean gameStart = true;
	public Job playerClass;
	public int currentEXPBar = 0;
	public int level = 1;
	public int currentFloor = 1;
	
	public Main() {
		
	}
	
	public void ViewProfile() {
		playerClass.setStat(level);
		System.out.println("You are a " + playerClass.getName());
		System.out.println("Your HP: " + playerClass.getHp());
		System.out.println("Your Armor: " + playerClass.getArmor());
		System.out.println("Your Attack: " + playerClass.getAttack());
		System.out.println("Your Str: " + playerClass.getStr());
		System.out.println("Your Agi: " + playerClass.getAgi());
		System.out.println("Your Int: " + playerClass.getIntel());
		System.out.println("Press enter to continue...");
	}
	
	public Job ClassSelection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Warrior");
		System.out.println("2. Priest");
		System.out.println("3. Archer");
		System.out.print("Select your class: ");
		int classChosen = sc.nextInt();
		
		playerClass = new Job();
		
		switch (classChosen) {
		case 1: {
			playerClass.setName("Warrior");
			playerClass.setHeroType("STR");
			playerClass.setStat(level);
			break;
		}
		case 2: {
			playerClass.setName("Priest");
			playerClass.setHeroType("INT");
			playerClass.setStat(level);
			break;
		}
		case 3: {
			playerClass.setName("Archer");
			playerClass.setHeroType("AGI");
			playerClass.setStat(level);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + classChosen);
		}
		
		return playerClass;
	}
	
	public void action() {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		System.out.println("You have battled a total of: " + currentEXPBar + " times");
		System.out.println("You are at Floor " + currentFloor);
		System.out.println("1. Grind EXP");
		System.out.println("2. Fight Floor Boss");
		System.out.println("3. View Profile");
		System.out.println("99. Quit");
		System.out.print("What would you like to do?");
		int action = sc.nextInt();
		switch (action) {
		case 1: {
			currentEXPBar++;
			level = (int) (1 + Math.floor(currentEXPBar / 2));
			main.clearscreen();
			System.out.println("You killed a monster! You gained an amount of EXP");
			
			break;
		}
		case 2: {
			if(playerClass.getHp() - (currentFloor*1000) > 0) {
				currentFloor++;
				main.clearscreen();
				System.out.println("You advanced to the next floor");
			}else {
				currentEXPBar = currentEXPBar/2;
				level = (int) (1 + Math.floor(currentEXPBar / 2));
				main.clearscreen();
				System.out.println("You have died and your battle progress is halved...");
			}
			break;
		}
		case 3: {
			main.clearscreen();
			ViewProfile();
			sc.nextLine();
			sc.nextLine();
			main.clearscreen();

			break;
		}
		case 99: {
			gameStart=false;
			
			break;
		}
		default:
			main.clearscreen();
			System.out.println("Wrong Action");
		}
	}
	
	public void clearscreen() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.clearscreen();
		main.ClassSelection();

		while(main.gameStart) {
			
			main.action();
			
		}
		

	}

}