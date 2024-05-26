public class function_overloading {
    public static void main(String[] args) {
        fun();
        fun("Aditya");
    }

    static void fun(){
        System.out.println("hello");
    }
    static void fun(String a){
        System.out.println(a);
    }
}
