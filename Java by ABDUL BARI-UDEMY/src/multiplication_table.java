import java.util.*;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to get table : ");
        int num =sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.print(num+"X"+i+" = "+num*i);
            System.out.println();
        }
    }
}
