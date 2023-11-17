package nov14;

public class Fact {
    public static void main(String[] args) {
        int num=5;
        int mul=1;
        while(num>0){
            System.out.println(num);
            mul*=num;
            num--;

        }
        System.out.println("Factorial 5!:"+mul);
    }
}
