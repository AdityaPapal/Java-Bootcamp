
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String friut = input.next();
        
        switch (friut) {
            case "Mango" -> System.out.println("Mango");
            case "Apple" -> System.out.println("Apple");
            default -> System.out.println("Other friut is in input");    
        }
        
        


    }    
}
