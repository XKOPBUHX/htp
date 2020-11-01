package by.htp.course_1.start.computer;

public class ComputerDemo {

    public static void main(String[] args) {

        Pc.printModel();
        System.out.println();

        Pc asus = new Pc();
        asus.setName("Asus");
        Hdd hdd = new Hdd(512);
        asus.setHdd(hdd);
        Ram ram = new Ram(2048);
        asus.setRam(ram);
        diagnose(asus);

        Hdd toshibaHdd = new Hdd(1024);
        Ram toshibaRam = new Ram(1024);
        Computer toshiba = new Pc("Toshiba", toshibaHdd, toshibaRam);
        diagnose(toshiba);

        Notebook notebook = new Notebook("Mac", new Hdd(4096), new Ram(8192));
        diagnose(notebook);

        Mobile mobile = new Mobile("Samsung", new Hdd(16384), new Ram(1024));
        diagnose(mobile);

        Computer[] computers = new Computer[] {notebook, mobile};
        for (Computer computer : computers) {
            diagnose(computer);
        }
    }

    private static void diagnose(Computer computer) {
        if (computer instanceof Notebook) {
            Notebook notebook = (Notebook) computer;
            notebook.open();
        }
        computer.on();
        computer.load();
        computer.off();
        System.out.println();
    }
}
