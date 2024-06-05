package input;

import java.util.Scanner;

public class inputs {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                //integer
                System.out.print("Enter the Number: ");
                int number = input.nextInt();

                // Char input or first word of string
                System.out.print("Enter the First Name: ");
                String ch = input.next();

                // float
                System.out.print("Enter the float Values: ");
                float floatnumber = input.nextFloat();




                input.nextLine();
                // String val
                System.out.print("Enter the  Full name: ");
                String name = input.nextLine();


                System.out.println("The number is: "+number);
                System.out.println("The float number is : "+floatnumber);
                System.out.println("The First name values is "+ ch);
                System.out.println("The Full name is: "+ name);
        }

}
