package by.htp.course_1.start.battleHeroes.other;

import by.htp.course_1.start.battleHeroes.model.Gender;

public class TechnologyTest {
    public static void main(String[] args) {
       /* deathTrap(new Mortal() {
            @Override
            public boolean isAlive() {
                return false;
            }

            @Override
            public void kill() {
                System.out.println("Приманка попадает в ловушку");
            }
        });

        deathTrap(new Hero("Временный герой", 10, 10) {
            @Override
            public void attackEnemy(Enemy enemy) {
                System.out.println(getName() + " пытается атаковать врага");
            }
        });

        printGenderData(Gender.MALE);*/
    }

    public static void deathTrap(Character character) {
        /*if (mortal instanceof Hero) {
            ((Hero) mortal).attackEnemy(new Enemy("Временный враг", 10, 10));
        }
        mortal.kill();*/
    }

    public static void printGenderData(Gender gender) {
        //System.out.println(gender.getDescription());
    }
}
