package nov21;

public class Main {
    public static void main(String[] args) {
        Computer pc=new Computer();
        pc.monitor="Dell";
        pc.keyboard="Dell";
        pc.display();
        pc.sound();
        System.out.println(pc.keyboard);
        System.out.println(pc.monitor);
    }

}
