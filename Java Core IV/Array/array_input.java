import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] arr = new int[size];
        
        for(int i = 0;i < arr.length; i++){
            arr[i] = in.nextInt();        
        }
        // for(int i:arr){
        //     System.out.println(i);
        // }
        System.out.println(Arrays.toString(arr));

    }
}
