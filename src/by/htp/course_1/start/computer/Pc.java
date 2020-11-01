package by.htp.course_1.start.computer;

public class Pc extends Computer {

    private static final String MODEL_NUMBER = "MODEL x64";

    public Pc() {

    }

    public Pc(String name, Hdd hdd, Ram ram) {
        super(name, hdd, ram);
    }

    public static void printModel() {
        System.out.println(MODEL_NUMBER);
    }

    @Override
    public void on() {
        System.out.println("ПК " + getName() + " включился");
    }

    @Override
    public boolean check() {
        return true;
    }
}
