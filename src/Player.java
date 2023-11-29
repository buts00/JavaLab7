/**
 * The Player class represents a character controlled by the user in the game.
 * It extends the MainCharacter class and includes additional information about the player's level.
 */
class Player extends MainCharacter {
    int level;

    /**
     * Constructs a Player object with a specified name, health, and level.
     *
     * @param name   the name of the player
     * @param health the health points of the player
     * @param level  the level of the player
     */
    public Player(String name, int health, int level) {
        super(name, health);
        this.level = level;
    }

    /**
     * Overrides the defend method from the MainCharacter class to specify the player's defending action.
     */
    @Override
    void defend() {
        System.out.println("Player defends!");
    }

    /**
     * Overrides the displayInfo method from the MainCharacter class to display player-specific information.
     * It shows the player's name, health, and level.
     */
    @Override
    void displayInfo() {
        this.defend();
        System.out.println("Player Info:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}
