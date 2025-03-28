import java.util.*;
public class check_binary_2nd_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String str=sc.next();
        if (str.matches("[01]*")){
            System.out.print("True");
        }
        else
            System.out.println("False");
    }
}
