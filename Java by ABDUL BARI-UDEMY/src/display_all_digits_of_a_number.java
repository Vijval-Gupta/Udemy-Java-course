import java.util.*;
public class display_all_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number : ");
        int x =sc.nextInt();
        int n;
        System.out.print("Digits are : ");
        while(x>0){
            n=x%10;

            System.out.print(n+",");
            x=x/10;
        }

    }
}
