package by.htp.course_1.start.computer;

public class Main {

    public static void main(String[] args) {
        Computer asus = new Computer();
        asus.setName("Asus");

        Hdd hdd = new Hdd(512);
        asus.setHdd(hdd);

        Ram ram = new Ram(2048);
        asus.setRam(ram);

        asus.on();
        asus.load();
        asus.off();

        Hdd toshibaHdd = new Hdd(1024);
        Ram toshibaRam = new Ram(1024);
        Computer toshiba = new Computer("Toshiba", toshibaHdd, toshibaRam);
        toshiba.on();
        toshiba.load();
        toshiba.off();

        Computer.printModel();
    }
}
