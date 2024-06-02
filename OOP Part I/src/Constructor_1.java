public class Constructor_1  {
    public static void main(String[] args) {

        info std = new info(1234,"Aditya Papal ",8.45f);
        // System.out.println("Roll number: " + std.roll);
        // System.out.println("Name: " + std.name);
        // System.out.println("Marks: "+ std.marks);
        std.display();
        info std2 = new info();
         System.out.println("Roll number: " + std2.roll);
         System.out.println("Name: " + std2.name);
         System.out.println("Marks: "+ std2.marks);
    }
}

class info {
    int roll;
    String name;
    float marks;

    info(){
        // this is how you call constructor from another constructor
        this(123,"aditya papal",8.55f);
    }

    info(int roll, String name, float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println("hey " + this.name +"how are you ?? ");
    }
}