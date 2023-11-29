/**
 * The MainCharacter class represents the main character in the game.
 * This class serves as a base for specific main character implementations.
 */
public abstract class MainCharacter {
    /** The name of the main character. */
    String name;

    /** The health points of the main character. */
    int health;

    /**
     * Constructs a new MainCharacter with a specified name and health.
     *
     * @param name   The name of the main character.
     * @param health The health points of the main character.
     */
    public MainCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * A method representing the defense action of the main character.
     * Specific implementations define the behavior of defending.
     */
    abstract void defend();

    /**
     * A method to display information about the main character.
     * Specific implementations provide details about the character.
     */
    abstract void displayInfo();
}
