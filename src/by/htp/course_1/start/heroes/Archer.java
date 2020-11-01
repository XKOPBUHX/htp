package by.htp.course_1.start.heroes;

public class Archer extends Hero {

    public Archer(String name) {
        super(name, 100, 10);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник выпускает стрелу в " + enemy.getName());
        super.damageEnemy(enemy);
    }
}
