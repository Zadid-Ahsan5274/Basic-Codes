import java.util.Arrays;
public class MonsterTwo {
	static char[][] battleBoard = new char[10][10];

	public static void buildBattleBoard() {
		for (char[] row : battleBoard) {
			Arrays.fill(row, '*');

		}
	}

	public static void redrawBoard() {
		int k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while (k <= 30) {
			System.out.print('-');
			k++;
		}
	}

	public final String TOMBSTRING = "Here Lies a Dead Monster";
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	public int xPosition = 0;
	public int yPosition = 0;
	private boolean alive = true;

	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public static int numberOfMonsters = 0;

	public int getAttack() {
		return attack;
	}

	public int getMovement() {
		return movement;
	}

	public int getHealth() {
		return health;
	}

	public boolean getAlive() {
		return alive;
	}

	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}

	public void setHealth(double decreaseHealth) {
		int intDecreasedHealth = (int) decreaseHealth;
		health = health - intDecreasedHealth;
		if (health < 0) {
			alive = false;
		}
	}

	public void moveMonster(MonsterTwo[] monster, int arrayItemIndex) {
		boolean isSpaceOpen = true;
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		while (isSpaceOpen) {
			int randMoveDirection = (int) (Math.random() * 4);
			int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));
			System.out.println(randMoveDistance + " " + randMoveDirection);
			battleBoard[this.yPosition][this.xPosition] = '*';
			if (randMoveDirection == 0) {
				if ((this.yPosition - randMoveDistance) < 0) {
					this.yPosition = 0;
				} else {
					this.yPosition = this.yPosition - randMoveDistance;
				}
			} else if (randMoveDirection == 1) {
				if ((this.xPosition + randMoveDistance) > maxXBoardSpace) {
					this.xPosition = maxXBoardSpace;
				} else {
					this.xPosition = xPosition + randMoveDistance;
				}
			} else if (randMoveDirection == 2) {
				if ((this.yPosition - randMoveDistance) > maxXBoardSpace) {
					this.xPosition = maxXBoardSpace;
				} else {
					this.xPosition = xPosition + randMoveDistance;
				}
			}
		}
	
	/*public MonsterTwo(int health, int movement, int attack, String name) {
		this.health = health;
		this.movement = movement;
		this.attack = attack;
		this.name = name;
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		int randNumX, randNumY;
		do {
			randNumX  = (int)(Math.random()*maxXBoardSpace);
			randNumY  = (int)(Math.random()*maxYBoardSpace);
		}while(battleBoard[randNumX][randNumY] != '*');
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		this.nameChar1 = this.name.charAt(0);
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		numberOfMonsters++;
	}
	
	// Default constructor
	public MonsterTwo() {
		numberOfMonsters++;
	}
	

	 * public Monster(int newHealth) { health = newHealth; }
	 * 
	 * public Monster(int newHeath, int newAttack) { this(newHealth); attack =
	 * newAttack; }

	
	public static void main(String[]args) {
		
		Monster Frank = new Monster();
		System.out.println(Frank.attack);

	}
}*/

	}
}