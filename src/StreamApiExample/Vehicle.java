package StreamApiExample;

public class Vehicle {

    public void move() 
    {
       System.out.println("Vehicles can move !!!!");
     }
   }

   class MotorBike extends Vehicle 
   {
     public void move()
   {
    System.out.println("MotorBike can move and accelerate too!!!");
   }
   }

   class Demo {

       public static void main(String[] args)
    {
      Vehicle obj=new MotorBike();
      obj.move();    // prints message MotorBike can move and accelerate too!!!
      obj=new Vehicle();
      obj.move();    // prints message Vehicles can move!!
    }
   }
