package by.htp.course_1.start.computer;

public class Computer {

    private static final String MODEL_NUMBER = "it's static field";

    private String name;
    private Hdd hdd;
    private Ram ram;

    public Computer() {

    }

    public Computer(String name, Hdd hdd, Ram ram) {
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        //this.hdd = hdd < 0 ? 0 : hdd;
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        //this.ram = ram < 0 ? 0 : ram;
        this.ram = ram;
    }


    public static void printModel() {
        System.out.println(MODEL_NUMBER);
    }

    public void on() {
        System.out.println(name + " включился");
    }

    public void load() {
        System.out.println("я загрузился");
        System.out.println("Ram: " + ram.getMemory() + ". Hdd: " + hdd.getCapacity());
    }

    public void off() {
        System.out.println("я выключился");
    }
}
