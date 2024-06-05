package Interface.CarExample;

public class Car implements Engine,Transmision,Dimensions{
        String name;
        Car(String name){
            this.name = name;
        }

        void name(){
            System.out.println("Car Name is: "+name);
        }


        @Override
        public void weight(String length,String Width, String kerb_weight) {
            System.out.println("Length of Car is: "+ length);
            System.out.println("Width of car is: "+ Width);
            System.out.println("Kerb Weight of car is: "+kerb_weight);
        }

        @Override
        public void ground_clearance(String gc) {
            System.out.println("Ground clearance of car is: "+gc);
        }

        @Override
        public void engine(String engine_name,String type) {
            System.out.println("Engine used by car is: "+engine_name);
            System.out.println("Engine type of car is: "+ type);
        }

        @Override
        public void power(String pow,String torque) {
            System.out.println("Power of car is: "+ pow);
            System.out.println("Torque of car is: "+ torque);
        }

        @Override
        public void drivetrain(String trans) {
            System.out.println("transmission used by car is: "+ trans);
        }

        @Override
        public void turbocharge(String turbo) {
            System.out.println("Turbo charge of car is: "+ turbo);
        }
}
