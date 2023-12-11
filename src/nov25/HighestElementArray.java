package nov25;

public class HighestElementArray {
    public static void main(String[] args) {
        int[] arr={10,20,50,110,25};
        //int[] arr1=new int[arr.length];
        int high=arr[0];
        int small=arr[0];
        for (int i=1;i< arr.length;i++) {
            if(arr[i]>high){
                high=arr[i];
            }
        }
        System.out.println("Highest value in array:"+high);
        for (int i=1;i< arr.length;i++) {
            if(arr[i]<high){
                high=arr[i];
            }
        }
        System.out.println("smallest value in array:"+small);
    }
}
