import java.util.*;
public class max_element_in_array {
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
        for (int i=0;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in array is "+max);




    }
}
