package by.htp.course_1.start.heroes;

public abstract class Hero implements Mortal {

    private String name;
    private int health;
    private int damage;

    public Hero(String name, int health, int damage) {
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

    public abstract void attackEnemy(Enemy enemy);

    protected void damageEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        System.out.println(name + " получает " + damage + " очков урона");
        if (health > damage) {
        health -= damage;
            System.out.println(name + " остался с " + health + " очками жизни");
        } else {
            kill();
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void kill() {
        health = 0;
        System.out.println(name + " пал в бою. RIP.");
    }
}
