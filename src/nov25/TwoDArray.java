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
        int[][] arr2=new int[3][3];
        arr2[0][0]=10;
        arr2[0][1]=20;
        arr2[0][2]=30;
        arr2[1][0]=40;
        arr2[1][1]=50;
        arr2[1][2]=60;
        arr2[2][0]=70;
        arr2[2][1]=80;
        arr2[2][2]=90;
        int[][] arr3=new int[3][3];

        for(int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.println(""+arr3[i][j]);
            }

        }




    }
}
