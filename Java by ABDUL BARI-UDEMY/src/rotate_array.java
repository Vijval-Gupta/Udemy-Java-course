import java.util.*;
public class rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        int x = sc.nextInt();
        int []arr=new int[x];
        for (int i =0;i<x;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array : ");
        for (int i =0;i<x;i++){
            System.out.print(arr[i]+" ");
        }

        //LEFT ROTATION
        int temp=arr[0];
        for (int i=0;i<x-1;i++){
            arr[i]=arr[i+1];
        }
        arr[x-1]=temp;
        System.out.println();
        System.out.print("Rotated Array : ");
        for (int nums:arr){
            System.out.print(nums+" ");
        }



    }

}