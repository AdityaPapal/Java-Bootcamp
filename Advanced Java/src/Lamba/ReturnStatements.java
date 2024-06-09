package Lamba;

interface A{
    int sum(int i,int j);

}
public class ReturnStatements {
    public static void main(String[] args) {
        A obj = (i,j) -> i+j;
        int ans = obj.sum(1,2);
        System.out.println(ans);
    }

}
