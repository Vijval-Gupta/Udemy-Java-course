import java.util.*;
public class num_of_words_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A SENTENCE : ");
        String str= sc.nextLine();
        String str2=str.replaceAll("[ ][ ]+"," ");
        String words[]=str2.split(" ");
        System.out.println("Number of words in given string are "+words.length);
    }
}
