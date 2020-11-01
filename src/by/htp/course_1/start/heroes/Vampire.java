package by.htp.course_1.start.heroes;

import java.util.Random;

public class Vampire extends Enemy {

    public Vampire(String name) {
        super(name, 40, 20);
    }

    @Override
    public void attackHero(Hero hero) {
        super.attackHero(hero);
        int randomNumber = new Random().nextInt(10);
        if (randomNumber > 2) {
            setHealth(getHealth() + 10);
            System.out.println(getName() + " восстанавливает 10 жизни");
            System.out.println("Стало " + getHealth() + " очков жизни");
        }
    }
}
