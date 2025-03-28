import java.util.*;
public class check_if_hexadecimal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String str= sc.next();
        if (str.matches("[0-9A-F]*")){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
