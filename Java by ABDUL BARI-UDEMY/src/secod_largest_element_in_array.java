import java.util.*;
public class secod_largest_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of elements in array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int sec=arr[1];
        for (int i=0;i<n;i++){
            if (arr[i]>sec){
                if (sec>max){
                    max=arr[i];
                }
                else {
                    sec=arr[i];
                }
            }
        }
        System.out.println("Second largest element in array is "+sec);




    }
}
