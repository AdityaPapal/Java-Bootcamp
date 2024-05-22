
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char ch = input.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch =='%'){
                System.out.print("Enter the First number: ");
                int a = input.nextInt();
                System.out.print("Enter the Second Number: ");
                int b = input.nextInt();

                if(ch == '+'){
                    ans = a+b;                    
                }
                if(ch == '-'){
                    ans = a-b;                    
                }    
                if(ch == '*'){
                    ans = a*b;                    
                }  
                if(ch == '/'){
                    ans = a/b;                    
                }  
                if(ch == '%'){
                    ans = a%b;                    
                }  
                System.out.println(ans);
            } else if(ch == 'X' || ch == 'x'){
                break;
            } else {
                System.out.println("Invaild Operator");
            }
        }



    }
}
