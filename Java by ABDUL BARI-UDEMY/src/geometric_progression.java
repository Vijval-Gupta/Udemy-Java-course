import java.util.*;
public class geometric_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int start=sc.nextInt();
        System.out.print("Enter common ratio : ");
        int cd= sc.nextInt();
        System.out.print("Enter till which number you want G.P : ");
        int n=sc.nextInt();
        int gp=0;
        for (int i =1;i<=n;i++){
            gp=start;
            System.out.print(gp+" ");
            start=start*cd;
        }


    }
}