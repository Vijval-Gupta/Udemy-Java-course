import java.util.*;
public class searching_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.print("Enter number of elements in array : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int ele=sc.nextInt();
        for(int i=0;i<n;i++){
            if (ele==arr[i]){
                System.out.println("Element found !!!");
                System.out.println("Index : "+i);
                System.out.println("Position : "+(i+1));
                flag=1;
                break;

            }

        }
        if (flag==0){
            System.out.println("ELEMENT NOT FOUND !!");
        }


    }
}
