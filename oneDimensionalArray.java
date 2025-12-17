 import java.util.*;
 public class oneDimensionalArray{
          public static void main(String[] args){
                    Scanner s = new Scanner(System.in);
                    int age[] = new int[5];
                    for(int i =0;i<age.length;i++)
                    {
                              System.out.print("Enter the age of student" +i);
                              age[i] = s.nextInt();
                    }
                    System.out.println("----- the ages are : -----");
                    for(int i =0;i<age.length;i++)
                    {
                              System.out.println(age[i]);
                    }
          }
 }