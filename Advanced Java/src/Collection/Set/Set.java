package Collection.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<Integer>();

        num.add(3);
        num.add(4);
        num.add(5);
        num.add(1);
        num.add(2);


        System.out.println(num);
    }
}
