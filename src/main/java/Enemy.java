public class Enemy {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setName() {
        this.name = name;
    }

    public void setHealth() {
        this.health = health;
    }

    public void setDamage() {
        this.damage = damage;
    }

    public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public String getEnemyDescription() {
        return "Name: " + name + "\nHealth: " + health + "\nDamage: " + damage;
    }
}

