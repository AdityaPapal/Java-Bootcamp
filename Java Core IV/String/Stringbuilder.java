public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for(int i = 0;i < 26;i++){
            char ch  = (char)('A' + i);
            str.append(ch);
        }
        System.out.println(str);
        
    }
}
