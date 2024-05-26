
import java.util.Arrays;

public class Varaiable_len_arguments {
    public static void main(String[] args) {
        fun(2,3,4,5);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

