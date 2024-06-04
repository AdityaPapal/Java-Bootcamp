package access;

public class a {
        public  int num1;
        private int num2;
        protected int num3;

        a (int num1,int num2,int num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }

        void getData (){
            System.out.println("Num1: " + num1);
            System.out.println("Num2: " + num2);
            System.out.println("Num3: " + num3);
        }


}
