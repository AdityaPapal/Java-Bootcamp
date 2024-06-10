package Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Map <Integer,Integer> mp = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        ArrayList<Integer>  arr = new ArrayList<>();

        for(int i = 0; i < size;i++){
            int x = input.nextInt();
            arr.add(x);
        }
        for (Integer integer : arr) {
            mp.put(integer, mp.get(integer == null ? 1 : mp.get(integer + 1)));
        }
       for(int n:mp.keySet()){
           System.out.println(n + "  :   " + mp.get(n));
       }
        System.out.println(mp);
    }
}
