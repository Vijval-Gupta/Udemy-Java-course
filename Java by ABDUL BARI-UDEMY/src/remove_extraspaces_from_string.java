import java.util.*;
public class remove_extraspaces_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sentence : ");
        String str= sc.nextLine();
        String str2=str.replaceAll("[ ][ ]+"," ");
        System.out.println("String after removing extra spaces is : "+str2);
    }
}
