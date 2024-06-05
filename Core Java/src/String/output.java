

public class output {
    public static void main(String[] args) {
        String ans = "";
        for(int i = 0;i < 26;i++){
            char ch  = (char)('A' + i);
            ans+=ch;
        }
        System.out.println(ans);

        // Its take o(N^2) time complexity 
    }
}
