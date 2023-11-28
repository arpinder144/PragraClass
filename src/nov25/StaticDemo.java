package nov25;

public class StaticDemo {
    static {
        {
            System.out.println("instance");
        }
        System.out.println("inside static block");
    }
    public static void main(String[] args) {
        System.out.println("main ");
        StaticDemo s=new StaticDemo();

    }
}
