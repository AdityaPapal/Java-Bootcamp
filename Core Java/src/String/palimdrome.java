public class palimdrome {
    public static void main(String[] args) {
        String palime = "abcbaasd";
        System.out.println(palimdrome(palime));

    }

    static boolean palimdrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        for(int i = 0;i < str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);
            if(start != end){
                return false;
            }
        }

        return true;
    }
}
