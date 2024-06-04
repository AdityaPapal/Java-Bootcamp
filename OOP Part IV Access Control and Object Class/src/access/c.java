package access;

public class c extends b {
        c(int num1,int num2,int num3) {
                super(num1,num2,num3);
        }

    @Override
    void getData() {
        System.out.println("From class c num1: "+ num1);
        System.out.println("From class c Num3: "+ num3);

    }
}
