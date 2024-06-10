package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class API {
    public static void main(String[] args) {

        Collection <Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for(Object n:num){
            System.out.println(n);
        }
        System.out.println(num);
    }
}
