package by.htp.course_1.start.heroes;

public class Enemy implements Mortal {

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

    public void setHealth(int health) {
        this.health = health;
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

    public void attackHero(Hero hero) {
        System.out.println(name + " атакует " + hero.getName());
        hero.takeDamage(damage);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void kill() {
        health = 0;
        System.out.println(name + " погибает");
    }
}
