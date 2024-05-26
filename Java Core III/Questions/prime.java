
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((prime(n) ? "Yes":"No"));
    }

    static boolean prime(int x){
        if(x <= 1){
            return false;
        }
        else{

            for(int i =2;i*i<= x;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    
    }
}
