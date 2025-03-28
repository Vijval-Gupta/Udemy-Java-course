import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int x ,reverse=0;
        int original=num;
        while(num>0){
            x=num%10;
            num=num/10;
            reverse=reverse*10+x;
        }
        if (original==reverse){
            System.out.println("PALINDROME");
        }
        else
            System.out.println("NOT A PALINDROME");


    }
}
