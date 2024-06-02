import java.util.Arrays;
public class Basic {
    public static void main(String[] args) {

        Student aditya = new Student();
        aditya.name = "Aditya Papal";
        aditya.email = "papaladitya@gmail.com";
        aditya.id = 124;

        System.out.println("Name: "+ aditya.name);
        System.out.println("Id: "+ aditya.id);
        System.out.println("Email Id: "+ aditya.email);

    }
}

class Student{
        int id;
        String name;
        String email;
}

