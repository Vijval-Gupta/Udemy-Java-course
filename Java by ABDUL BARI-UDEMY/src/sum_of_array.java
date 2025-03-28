import java.util.*;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }

        int sum =0;
        for(int x:arr){
            sum+=x;
        }
        System.out.print("Sum of all elements of array is "+sum);
    }
}
