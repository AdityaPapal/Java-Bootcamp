
import java.util.Scanner;

public class print_sum{

    public static void main(String[] args) {
        
        // print te sum of two number using methods
        // int ans = sum2();
        // System.out.print("Sum of Two Number: "+ ans);
        
        // return the string 
        System.out.println(str());
    }


    static String str(){

        String string = "Learn Java";
        return string;
    }

    //  Return the sum
    static int sum2(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Frist number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;
    }
    
    
    // print the sum
    static void sum(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Frist number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.print("Sum of Two number is: " + sum);
    }
}