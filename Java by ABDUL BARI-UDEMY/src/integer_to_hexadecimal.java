import java.util.*;
import java.lang.*;


public class integer_to_hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");
        int x= sc.nextInt();
        System.out.println(x+" in hexadecimal is : "+Integer.toHexString(x));
    }
}
