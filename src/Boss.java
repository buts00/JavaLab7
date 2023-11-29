/**
 * The Boss class represents a powerful enemy known as Boss in the game.
 * It extends the Enemy class and includes additional information about the boss's power.
 */
class Boss extends Enemy {
    int bossPower;

    /**
     * Constructs a Boss object with a specified name, health, enemy type, and boss power.
     *
     * @param name       the name of the boss
     * @param health     the health points of the boss
     * @param enemyType  the type of enemy
     * @param bossPower  the power level of the boss
     */
    public Boss(String name, int health, String enemyType, int bossPower) {
        super(name, health, enemyType);
        this.bossPower = bossPower;
    }

    /**
     * Overrides the attack method from the Enemy class to specify the boss's attacking action.
     */
    @Override
    void attack() {
        System.out.println("Boss attacks!");
    }

    /**
     * Overrides the displayInfo method from the Enemy class to display boss-specific information.
     * It shows the boss's name, health, enemy type, and power level.
     */
    @Override
    void displayInfo() {
        this.attack();
        System.out.println("Boss Info:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Enemy Type: " + enemyType);
        System.out.println("Boss Power: " + bossPower);
    }
}
