import java.util.Scanner;

public class Occurance_of_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number that needs to find occ: ");
        int num = input.nextInt();
        int n = 13453363;
        
        int cnt = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == num){
                cnt++;
            }
            n/=10;
        }
        System.out.println("The Number of Occurance of "+ num +" is "+ cnt);

    }   
}
