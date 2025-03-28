import java.util.*;
public class leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a year (yyyy) : ");
        int year=sc.nextInt();
        String str=Integer.toString(year);
        if (str.length()==4){
            if (year%4==0){
                System.out.println("Its a leap year !!");
            }
        }
        else {
            System.out.println("Not a leap year !!");
        }
    }
}
