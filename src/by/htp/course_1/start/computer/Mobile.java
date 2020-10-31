package by.htp.course_1.start.computer;

public class Mobile extends Computer {
    public Mobile(String name, Hdd hdd, Ram ram) {
        super(name, hdd, ram);
    }

    @Override
    public void on() {
        System.out.println("Мобильный телефон " + getName() + " включился");
    }

    @Override
    public String toString() {
        return "Mobile: " + getName();
    }
}
