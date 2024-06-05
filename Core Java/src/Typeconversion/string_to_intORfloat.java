package Typeconversion;

import java.util.Scanner;

public class string_to_intORfloat {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                 String strnum = input.nextLine();

                int str_num = Integer.parseInt(strnum);
                System.out.println(str_num);

                float str_float = Float.parseFloat(strnum);
                System.out.println(str_float);

                int num = input.nextInt();
                String num_str = String.valueOf(num);
                System.out.println(num_str);

        }
}
