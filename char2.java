public class Character {
    private String name;
    private int health;
    private int strength;
    private int defense;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public void attack(Character opponent) {
        int damage = Math.max(0, this.strength - opponent.defense);
        opponent.health -= damage;
        System.out.println(this.name + " attacks " + opponent.name + " for " + damage + " damage!");
        if (opponent.health <= 0) {
            System.out.println(opponent.name + " has been defeated!");
        }
    }

    public void heal(int amount) {
        this.health += amount;
        System.out.println(this.name + " heals for " + amount + " health.");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public static void main(String[] args) {
        Character player = new Character("Player", 100, 20, 10);
        Character enemy = new Character("Enemy", 80, 15, 8);

        player.attack(enemy); // Player attacks Enemy
        enemy.attack(player); // Enemy attacks Player

        player.heal(20); // Player heals
    }
}

