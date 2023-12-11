package dec02;

public class TestConstructor {
    String name;
    String email;
    double salary;

    public static void main(String[] args) {
        TestConstructor test=new TestConstructor("Arpinder","arpinder144",2000.0);
        test.showDetails();
    }

    public TestConstructor() {
        System.out.println("default constructor");
    }
    public TestConstructor(String name){
        this();
        System.out.println("1st arg constructor");
        this.name=name;
    }
    public TestConstructor(String name,String email){
        this(name);
        System.out.println("2nd arg constructor");
        this.name=name;
        this.email=email;
    }
    public TestConstructor(String name, String email, double salary){
        this(name, email);
        System.out.println("3rd arg constructor");
        this.name=name;
        this.email=email;
        this.salary=salary;
    }
    public void showDetails(){
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Salary"+salary);
    }


}
