import java.util.*;
public class radix_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Radix binary number ko leta aur decimal me convert karke deta hai
        sc.useRadix(2);
        int x = sc.nextInt();
        System.out.println(x);

    }
}
