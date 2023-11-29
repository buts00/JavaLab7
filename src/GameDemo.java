import java.util.Scanner;
import java.util.Vector;

/**
 * The GameDemo class demonstrates a simple game scenario with characters and interaction.
 */
public class GameDemo {
    /** The collection of enemies in the game. */
    static Vector<Enemy> enemies = new Vector<>();

    /**
     * Adds an enemy to the collection of enemies.
     *
     * @param enemy The enemy to be added.
     */
    public static void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    /**
     * The main method running the game scenario.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        MainCharacter player = new Player("GoodPlayer", 100, 5);

        // Creating enemies and adding them to the collection
        Enemy goblin = new Goblin("Minion", 30, "Goblin", 3);
        Enemy zombie = new Zombie("Undead", 50, "Zombie", true);
        Enemy boss = new Boss("Big Boss", 200, "Final Boss", 20);
        addEnemy(goblin);
        addEnemy(zombie);
        addEnemy(boss);

        // Game loop
        while (!exit) {
            System.out.println("Choose an option: ");
            System.out.println("1. View information about the player");
            System.out.println("2. View information about enemies");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    player.displayInfo();
                }
                case 2 -> {
                    System.out.println("All Enemies in the Game:");
                    for (Enemy enemy : enemies) {
                        enemy.displayInfo();
                    }
                }
                case 3 -> {
                    exit = true;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
