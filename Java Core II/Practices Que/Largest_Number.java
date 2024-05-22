import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        // Largest of 3 number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int b = input.nextInt(); 

        System.out.print("Enter the Third Number: ");
        int c = input.nextInt();
        
        //  Method 1 
        if(a > b && a > c){
            System.out.println("Number A is Largest");
        }
        else if (b > a && b > c){
            System.out.println("Number B is Largest");
        }
        else{
            System.out.println("Number C is Largest");
        }
        //  method 2

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println("The Maximum nmumber is "+max);
        

        // Method 3 
        int maxi = Math.max(Math.max(a, b),c);

        System.out.println("The Maximum nmumber is "+maxi);

    }    
}
