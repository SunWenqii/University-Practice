package model;

public class Hero {
	private String name;
	private int attack;
	private int life;
	
	public Hero() {
		super();
	}

	public Hero(String name, int attack, int life) {
		super();
		this.name = name;
		this.attack = attack;
		this.life = life;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", attack=" + attack + ", life=" + life
				+ "]";
	}
	
	public void fight(Monster m) {

		m.setLife(m.getLife() - this.attack);

	}
	
}
