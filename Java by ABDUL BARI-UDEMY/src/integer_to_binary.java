import java.lang.*;
import java.util.*;

public class integer_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");
        int x= sc.nextInt();
        System.out.println(x+" in binary is : "+Integer.toBinaryString(x));
    }
}
