/**
 * The Goblin class represents an enemy character called Goblin in the game.
 * It extends the Enemy class and includes additional information about the goblin's level.
 */
class Goblin extends Enemy {
    int goblinLevel;

    /**
     * Constructs a Goblin object with a specified name, health, enemy type, and goblin level.
     *
     * @param name       the name of the goblin
     * @param health     the health points of the goblin
     * @param enemyType  the type of enemy
     * @param goblinLevel the level of the goblin
     */
    public Goblin(String name, int health, String enemyType, int goblinLevel) {
        super(name, health, enemyType);
        this.goblinLevel = goblinLevel;
    }

    /**
     * Overrides the attack method from the Enemy class to specify the goblin's attacking action.
     */
    @Override
    void attack() {
        System.out.println("Goblin attacks!");
    }

    /**
     * Overrides the displayInfo method from the Enemy class to display goblin-specific information.
     * It shows the goblin's name, health, enemy type, and goblin level.
     */
    @Override
    void displayInfo() {
        this.attack();
        System.out.println("Goblin Info:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Enemy Type: " + enemyType);
        System.out.println("Goblin Level: " + goblinLevel);
    }
}
