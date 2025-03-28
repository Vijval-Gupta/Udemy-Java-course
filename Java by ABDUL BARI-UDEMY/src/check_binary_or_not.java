import java.util.*;
public class check_binary_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        String str=sc.next();
        int flag=1;
        char[] arr=str.toCharArray();
        int x = arr.length;
        for (int i =0;i<x;i++){
            if (arr[i]=='0'|arr[i]=='1'){
                continue;
            }
            else{
                flag=0;
                break;
            }
        }
        if (flag==0){
            System.out.print("Number not in binary format !!");
        }
        else{
            System.out.print("Number is binary!!");
        }

    }
}
