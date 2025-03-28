import java.util.*;
public class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int x ,reverse=0;
        while(num>0){
            x=num%10;
            num=num/10;
            reverse=reverse*10+x;
        }
        System.out.println("Reverse of given number : "+reverse);


    }
}
