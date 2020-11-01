package by.htp.course_1.start.heroes;

public class Mage extends Hero {

    public Mage(String name) {
        super(name, 50, 30);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг произносит заклинание");
        super.damageEnemy(enemy);
    }
}
