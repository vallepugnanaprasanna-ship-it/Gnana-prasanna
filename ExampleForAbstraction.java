import java.util.*;
abstract class Plane
{
          abstract void takeoff();
          abstract void fly();
          abstract void land();
}
class CargoPlane extends Plane
{
          void takeoff()
          {
                    System.out.println("CargoPlane is taking off");
          }
          void fly()
          {
                    System.out.println("CargoPlane is fiying at low height");
          }
          void land()
          {
                    System.out.println("CargoPlane is landing");
          }
}
class PassangerPlane extends  Plane 
{   
            void takeoff()
          {
                    System.out.println("PassangerPalne is taking off");
          }
          void fly()
          {
                    System.out.println("PassangerPlane is fiying at low height");
          }
          void land()
          {
                    System.out.println("PassangerPlane is landing");
          }
}
class FighterPlane extends Plane 
{
          void takeoff()
          {
                    System.out.println("FighterPlane is taking off");
          }
          void fly()
          {
                    System.out.println("FighterPlane is fiying at low height");
          }
          void land()
          {
                    System.out.println("FighterPlane is landing");
          }
}
class AirPort{
          void permit(Plane ref){
                    ref.takeoff();
                    ref.fly();
                    ref.land();
          }
}
public class ExampleForAbstraction {
          public static void main(String[] args){
              CargoPlane cp = new CargoPlane();
              PassangerPlane pp = new PassangerPlane();
              FighterPlane fp = new FighterPlane();
              AirPort a = new AirPort();
              a.permit(fp);
              a.permit(cp);
              a.permit(pp);
          }
}
