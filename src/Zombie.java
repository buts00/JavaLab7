/**
 * The Zombie class represents an enemy character known as Zombie in the game.
 * It extends the Enemy class and includes information about whether the zombie is decayed or not.
 */
class Zombie extends Enemy {
    boolean isDecayed;

    /**
     * Constructs a Zombie object with a specified name, health, enemy type, and decayed status.
     *
     * @param name       the name of the zombie
     * @param health     the health points of the zombie
     * @param enemyType  the type of enemy
     * @param isDecayed  whether the zombie is decayed or not
     */
    public Zombie(String name, int health, String enemyType, boolean isDecayed) {
        super(name, health, enemyType);
        this.isDecayed = isDecayed;
    }

    /**
     * Overrides the attack method from the Enemy class to specify the zombie's attacking action.
     */
    @Override
    void attack() {
        System.out.println("Zombie attacks!");
    }

    /**
     * Overrides the displayInfo method from the Enemy class to display zombie-specific information.
     * It shows the zombie's name, health, enemy type, and decayed status.
     */
    @Override
    void displayInfo() {
        this.attack();
        System.out.println("Zombie Info:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Enemy Type: " + enemyType);
        System.out.println("Decayed: " + isDecayed);
    }
}
