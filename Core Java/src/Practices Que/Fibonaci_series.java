import java.util.Scanner;

public class Fibonaci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int a = 0;
        int b = 1;
        int cnt = 2;
        // 0 1 1 2 3 5 8 
        while(cnt <= n){
            int temp = b;
            b = b+a;
            a = temp;
            cnt++; 
        }
        System.out.println(b);
    }  
}
