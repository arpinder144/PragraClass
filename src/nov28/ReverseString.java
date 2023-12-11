package nov28;

public class ReverseString {


    public static void main(String[] args) {
        String str="pragra";
        char[] ch=str.toCharArray();
        char[] arr1=new char[ch.length];
        int j= ch.length;
        for (int i=0;i<ch.length;i++){
            arr1[j-1]=ch[i];
            j=j-1;
        }
        for (char element:arr1) {
            System.out.print(" "+element);
        }
    }
}
