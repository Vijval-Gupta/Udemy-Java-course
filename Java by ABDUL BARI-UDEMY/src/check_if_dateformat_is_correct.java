import java.util.*;
public class check_if_dateformat_is_correct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date : ");
        String str=sc.next();
        if (str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}")){
            System.out.println("Date is in correct dd/mm/yyyy format !!!");
        }
        else {
            System.out.println("Wrong date format !!!");
        }
    }
}