package by.htp.course_1.start.heroes;

public class BattleGround {
    public static void main(String[] args) {
        Enemy[] zombies = new Enemy[] {
                new Zombie("Зомби"),
                new Vampire("Вампир"),
                new Zombie("Зоомби")
        };
        Warrior conan = new Warrior("Конан");
        fightOnArena(conan, zombies);
    }

    private static void fightOnArena(Hero hero, Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            mortalFight(hero, enemy);
        }
    }

    public static void mortalFight(Hero hero, Enemy enemy) {
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }
    }
}
