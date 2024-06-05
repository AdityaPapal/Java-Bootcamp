public class basic {

    public static void main(String[] args) {
 
        String a  ="aditya";
        String b = "aditya";

        System.out.println(((a.equals(b)) ? "YES" : "No"));    
        
        String n1 = new String("Aditya");
        String n2 = new String("Aditya");


        System.out.println(((n1==n2) ? "YES" : "No")); 
        System.out.println(n1.equals(n2));  
    }
    
}
