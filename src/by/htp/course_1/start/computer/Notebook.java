package by.htp.course_1.start.computer;

public class Notebook extends Computer implements Openable {

    public Notebook(String name, Hdd hdd, Ram ram) {
        super(name, hdd, ram);
    }

    @Override
    public void on() {
        System.out.println("Ноутбук " + getName() + " включился");
    }

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public String toString() {
        return "Notebook: " + getName();
    }

    @Override
    public void open() {
        System.out.println("Крышка открыта");
    }
}
