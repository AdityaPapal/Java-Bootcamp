
import java.util.ArrayList;

public class basicc {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // System.out.println(arr.get(1));
        System.out.println(arr.contains(4));
        System.out.println(arr);   
        
        for(int i = 0;i < arr.size();i++){
            System.out.println(arr.get(i));
        }
        
        for(int i = 0;i < arr.size();i++){
            int x = arr.get(i);
            arr.set(i,x+1);
        }
        System.out.println();
        for(int i = 0;i < arr.size();i++){
            System.out.println(arr.get(i));
        }      
    }   
}
