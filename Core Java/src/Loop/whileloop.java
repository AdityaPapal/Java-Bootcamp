import java.util.Scanner;

public class whileloop{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numer:  ");
        int num = input.nextInt();
        
        int n = 1;
        while(n!=num+1){
            System.out.println(n);
            n++;
        }

    }
}