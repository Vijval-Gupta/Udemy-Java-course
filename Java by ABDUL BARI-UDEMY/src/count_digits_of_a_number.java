import java.util.*;
public class count_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number : ");
        int x =sc.nextInt();
        int count=0;
        while(x>0){
            count++;
            x=x/10;
        }
        System.out.println("Number of digits in given number are "+count);

    }
}
