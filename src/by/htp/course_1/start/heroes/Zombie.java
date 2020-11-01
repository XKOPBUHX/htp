package by.htp.course_1.start.heroes;

public class Zombie extends Enemy {
    private boolean diedOnce = false;

    public Zombie(String name) {
        super(name, 25,30);
    }

    @Override
    public void kill() {
        if (!diedOnce) {
            System.out.println(getName() + " погибает");
            diedOnce = true;
            setHealth(20);
            System.out.println(getName() + " воскресает");
        } else {
            super.kill();
        }
    }
}
