package nov25;

public class TwoDArray{
    public static void main(String[] args) {
        int[][] arr1=new int[3][3];
        arr1[0][0]=10;
        arr1[0][1]=20;
        arr1[0][2]=30;
        arr1[1][0]=40;
        arr1[1][1]=50;
        arr1[1][2]=60;
        arr1[2][0]=70;
        arr1[2][1]=80;
        arr1[2][2]=90;

        for (int[] element:arr1) {
            for (int number:element) {
                System.out.println(number);

            }

        }
    }
}
