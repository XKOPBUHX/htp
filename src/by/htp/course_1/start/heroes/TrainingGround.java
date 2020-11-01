package by.htp.course_1.start.heroes;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy("Зомби", 20, 10);

        Hero legolas = new Archer("Леголас");
        legolas.attackEnemy(enemy);
    }
}
