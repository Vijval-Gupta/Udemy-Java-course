import java.util.*;
public class armstrong_for_3digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int n,sum=0;
        int original=num;

        while(num>0){
            n=num%10;
            int cube=n*n*n;
            sum=sum+cube;
            num=num/10;

        }
        if (sum==original){
            System.out.println("ARMSTRONG NUMBER ");
        }
        else {
            System.out.println("NOT AN ARMSTRONG NUMBER ");
        }
    }
}