
public class Job {
	
	private double hp;
	private double armor;
	private double attack;
	private double mana;
	private double str;
	private double agi;
	private double intel;
	private String name;
	private String heroType;
	private double baseSTRGrowth;
	private double baseAGIGrowth;
	private double baseINTGrowth;
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getArmor() {
		return armor;
	}
	public void setArmor(double armor) {
		this.armor = armor;
	}
	public double getAttack() {
		return attack;
	}
	public void setAttack(double attack) {
		this.attack = attack;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getStr() {
		return str;
	}
	public void setStr(double str) {
		this.str = str;
	}
	public double getAgi() {
		return agi;
	}
	public void setAgi(double agi) {
		this.agi = agi;
	}
	public double getIntel() {
		return intel;
	}
	public void setIntel(double intel) {
		this.intel = intel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeroType() {
		return heroType;
	}

	public void setHeroType(String heroType) {
		this.heroType = heroType;
	}
	
	public void setStat(int level) {
		// TODO Auto-generated constructor stub
		//System.out.println(getHeroType());
		//System.out.println(getName());
		switch(getHeroType()) {
			case "STR":
				this.setStr(5 + (level * 2 * 1.5));
				this.setAgi(5 + (level * 2));
				this.setIntel(5 + (level * 2));
				break;
			case "INT":
				this.setStr(5 + (level * 2));
				this.setAgi(5 + (level * 2));
				this.setIntel(5 + (level * 2 * 1.5));
				break;
			case "AGI":
				this.setStr(5 + (level * 2));
				this.setAgi(5 + (level * 2 * 1.5));
				this.setIntel(5 + (level * 2));
				break;
		}
		
		this.setMana(100 + (this.getIntel() * 20));
		this.setAttack(10 + (this.getStr()));
		this.setArmor(1 + (this.getAgi() * 0.1));
		this.setHp(this.getStr() * 50);
		
	}
	
}
