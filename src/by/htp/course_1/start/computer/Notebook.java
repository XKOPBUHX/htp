package by.htp.course_1.start.computer;

public class Notebook extends Computer {
    public Notebook(String name, Hdd hdd, Ram ram) {
        super(name, hdd, ram);
    }

    @Override
    public String toString() {
        return getName() + ". RAM: " + getRam().getMemory() + ". HDD " + getHdd().getCapacity();
    }
}
