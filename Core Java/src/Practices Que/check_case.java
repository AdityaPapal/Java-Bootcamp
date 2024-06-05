
import java.util.Scanner;

public class check_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch > 'a' && ch > 'z' ){
            System.out.println("The First Character of sentence is in lowercase");
        } else {
            System.out.println("The First Character of sentence is in Uppercase");
        }
    }   
}
