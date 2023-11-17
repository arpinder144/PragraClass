package nov14;

public class LoopsDemo {
    public static void main(String[] args) {
        int num=1;
        int sum=0;
        while(num<11){
            System.out.println(num);
            sum += num;
            num++;
        }
        System.out.println("sum:"+sum);

    }
}
