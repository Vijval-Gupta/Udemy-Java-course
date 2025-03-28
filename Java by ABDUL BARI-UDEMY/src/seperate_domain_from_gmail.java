import java.util.*;
public class seperate_domain_from_gmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter your email : ");
        str = sc.next();
        int x = str.indexOf("@");
        String str1=str.substring(0,x);
        if (str.endsWith("gmail.com")){
            System.out.println("Congratulations !! Account provided by you is a gmail account .");
            System.out.println("UserName : "+str1);
            System.out.println("Domain Name : "+"gmail.com");

        }
        else {
            System.out.println("Sorry !! Account provided by you is not a gmail account .");
            System.out.println("Domain Name : "+str.substring(x+1));
        }



    }
}
