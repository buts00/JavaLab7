/**
 * The Enemy class represents a generic enemy in the game.
 * This class serves as a base for specific enemy implementations.
 */
public abstract class Enemy {
    /** The name of the enemy. */
    String name;

    /** The health points of the enemy. */
    int health;

    /** The type of the enemy. */
    String enemyType;

    /**
     * Constructs a new Enemy with a specified name, health, and enemy type.
     *
     * @param name       The name of the enemy.
     * @param health     The health points of the enemy.
     * @param enemyType  The type of the enemy.
     */
    public Enemy(String name, int health, String enemyType) {
        this.name = name;
        this.health = health;
        this.enemyType = enemyType;
    }

    /**
     * A method representing the attack action of the enemy.
     * Specific implementations define the behavior of attacking.
     */
    abstract void attack();

    /**
     * A method to display information about the enemy.
     * Specific implementations provide details about the enemy.
     */
    abstract void displayInfo();
}
