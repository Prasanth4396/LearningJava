public class DieselVehicle {
    public static void main(String[] args){

        Vehicle car=new Vehicle();
        car.cc=1000;
        car.brandName="Audi";
        car.colour="White";
        car.year=1995;
        car.numberOfWheels=4;

        Vehicle bike=new Vehicle();
        bike.cc=125.5;
        bike.brandName="TVS";
        bike.colour="Red";
        bike.year=2000;
        bike.numberOfWheels=2;

        Vehicle lorry=new Vehicle();
        lorry.cc=10000;
        lorry.brandName="Eicher";
        lorry.colour="Black";
        lorry.year=2005;
        lorry.numberOfWheels=12;


        System.out.println(car.brandName);
        System.out.println(bike.cc);
        System.out.println(lorry.colour);
        System.out.println(car.year);
        System.out.println(lorry.numberOfWheels);

    lorry.handleHeavyLoad();
    car.speedFor();


    }
}
