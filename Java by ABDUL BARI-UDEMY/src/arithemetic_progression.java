import java.util.*;
public class arithemetic_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int start=sc.nextInt();
        System.out.print("Enter common difference : ");
        int cd= sc.nextInt();
        System.out.print("Enter till which number you want A.P : ");
        int n=sc.nextInt();
        int ap=0;
        for (int i =1;i<=n;i++){
            ap=start;
            System.out.print(ap+" ");
            start=start+cd;
        }


    }
}
