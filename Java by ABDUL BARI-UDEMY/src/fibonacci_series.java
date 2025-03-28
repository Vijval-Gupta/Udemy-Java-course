import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till you want fibonacci series : ");
        int n=sc.nextInt();
        int start=0;
        int end=1;
        int sum;
        System.out.print("0 1"+" ");
        for (int i=0;i<n-2;i++){
            sum=start+end;
            System.out.print(sum+" ");
            start=end;
            end=sum;

        }
    }
}
