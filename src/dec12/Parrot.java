package dec12;

public class Parrot extends Bird implements CanFly{
    @Override
    public void flying() {
        System.out.println("Bird can fly");;
    }
    public void eat(){
        System.out.println("parrot can eat...");
    }


}
