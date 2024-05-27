
import java.util.Arrays;
import java.util.Scanner;

public class array_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the the size of Array; ");
        int size = in.nextInt();

        String[] str = new String[size];

        for(int i = 0;i < str.length;i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    
    }
}
