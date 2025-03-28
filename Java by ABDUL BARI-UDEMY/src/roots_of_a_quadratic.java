import java.util.*;
import java.lang.Math;
public class roots_of_a_quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LET EQN BE Ax2+Bx+C");
        System.out.print("Enter a : ");
        float a= sc.nextFloat();
        System.out.print("enter b : ");
        float b=sc.nextFloat();
        System.out.print("enter c : ");
        float c =sc.nextFloat();
        double real = -b/(2*a);
        double discriminant =(b*b-4*a*c);
        double imaginary = Math.sqrt(discriminant)/(2*a);
        if (discriminant==0){
            System.out.println("ROOTS ARE REAL AND EQUAL ");
            System.out.println("ROOTS : "+real+" and "+real);
        }
        if (discriminant>0){
            System.out.println("ROOTS ARE REAL AND DIFFERENT ");
            System.out.print("ROOTS : "+real+imaginary+" and "+(real-imaginary));
        }
        if (discriminant<0){
            imaginary = Math.sqrt(-discriminant)/(2*a);
            System.out.println("ROOTS ARE IMAGINARY ");
            System.out.print("ROOTS : "+real+"+"+imaginary+"i"+" and "+real+"-"+imaginary+"i");
        }
    }
}
