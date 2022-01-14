
public class Monster {

	public final String TOMBSTRING = "Here Lies a Dead Monster";
	private int health = 500;
	protected int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if(health < 0) {
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth) {
		int intDecreasedHealth = (int)decreaseHealth;
		health = health - intDecreasedHealth;
		if(health < 0) {
			alive = false;
		}
	}
	
	public Monster(int health, int movement, int attack) {
		this.health = health;
		this.movement = movement;
		this.attack = attack;
	}
	
	// Default constructor
	public Monster() {
		
	}
	
	/*
	 * public Monster(int newHealth) { health = newHealth; }
	 * 
	 * public Monster(int newHeath, int newAttack) { this(newHealth); attack =
	 * newAttack; }
	 */
	
	public static void main(String[]args) {
		
		Monster Frank = new Monster();
		System.out.println(Frank.attack);
		
		
		
		
		
		
		
		
		
		
	}
}
