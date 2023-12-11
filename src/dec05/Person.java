package dec05;

public class Person {
    String name;
    Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void show(){
        System.out.println("Name:"+name);
        System.out.println("Car:"+car);
    }
}
class Main{
    public static void main(String[] args) {
        Person person=new Person("Arpinder",new Car("sedan","red","BMW"));
        person.show();
    }
}

