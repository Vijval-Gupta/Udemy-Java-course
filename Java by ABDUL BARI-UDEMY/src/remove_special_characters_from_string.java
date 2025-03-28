import java.util.*;
public class remove_special_characters_from_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str= sc.next();
        String str2=str.replaceAll("[!@#$%^&*()]","");
        System.out.println("Final string is : "+str2);
    }
}
