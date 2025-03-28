import java.util.*;
public class area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER HEIGHT OF TRIANGLE (in cm) : ");
        float x = sc.nextFloat();
        System.out.print("ENTER BASE OF TRIANGLE (in cm) :");
        float y = sc.nextFloat();
        System.out.print("Area of triangle is "+0.5*x*y+" sq.cm");
    }
}
