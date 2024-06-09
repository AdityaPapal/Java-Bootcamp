package Enumeration;

import java.util.Arrays;

enum Status{
    Running,Failed,Pending,Success;
}
public class Main {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);

        Status[] val = Status.values();
        System.out.println(Arrays.toString(val));


    }
}
