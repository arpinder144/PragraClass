package nov7;

public class SwapDemo {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("value before swap");
        System.out.println("x:"+x+"Y:"+y);
        int temp=x;
         x=y;
         y=temp;
        System.out.println("value after swap");
         System.out.println("x:"+x+"Y:"+y);
    }
}
