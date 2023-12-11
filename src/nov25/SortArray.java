package nov25;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={80,50,40,30,20};

        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int element:arr
             ) {
            System.out.println(element);

        }







}}
