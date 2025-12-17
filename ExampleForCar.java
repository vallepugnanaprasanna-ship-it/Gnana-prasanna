import java.util.*;
class Car{
          // Attributes, poperties of an object
          private String name;
          private String color;
          private int mileage;
          // Setter Method
          public void setData(String x, String y, int a){
                    name = x;
                    color = y;
                    mileage = a;
          }
           public String getName()
          {
                    return name;
          }
           public String getColor ()
          {
                    return color;
          }
           public int getMileage ()
          {
                    return mileage;
          }
      }
public class ExampleForCar { 
          public static void main(String[] args){
                Car s = new Car();
                s.setData("thar","Black",20);
                System.out.println("The name of the car: "+s.getName());
                System.out.println("The color of the car : "+s.getColor());
                System.out.println("The mileage of the car : "+s.getMileage());
          }
      }
  
