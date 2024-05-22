package Loop;

import java.util.Scanner;

public class forloop {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
//				 print number from 1 to n;
					System.out.print("Enter the Number: ");
					int n  = input.nextInt();
					for(int i = 1;i <= n;i++){
						System.out.println(i);
					}
		}
}
