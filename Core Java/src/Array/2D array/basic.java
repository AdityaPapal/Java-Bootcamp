
import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                arr[i][j] = in.nextInt();
            }
        }

        // 1 method to print
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // 2 method for print
        for(int [] a :arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        // 3rd Method
        for(int i = 0;i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

            
    }
}
