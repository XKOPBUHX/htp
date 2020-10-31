package by.htp.course_1.start.computer;

public class ComputerDemo {

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

        Notebook notebook = new Notebook("Mac", new Hdd(4096), new Ram(8192));
        notebook.on();
        notebook.load();
        notebook.off();

        System.out.println(notebook);
    }
}
