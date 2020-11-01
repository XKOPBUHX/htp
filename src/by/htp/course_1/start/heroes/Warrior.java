package by.htp.course_1.start.heroes;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин бросается на " + enemy.getName());
        super.damageEnemy(enemy);
    }
}
