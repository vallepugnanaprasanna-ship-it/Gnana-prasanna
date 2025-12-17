import java.util.Scanner;
abstract class Calcutor{
    abstract void add();
        abstract void sub();
        abstract void mul();
        abstract void div();

    }
    class MyCalcutor extends Calcutor{
        void add(){
            int number1 = 20;
            int number2 = 30;
            int sum = number1+number2;
            System.out.println("The sum is:"+ sum);
        }
        void sub(){
            int number1 = 20;
            int number2 = 30;
            int diff = number1-number2;
            System.out.println("The difference is:"+ diff);
        }
        void mul(){
            int number1 = 20;
            int number2 = 30;
            int mul= number1*number2;
            System.err.println("The product is:" + mul);
        }
        void div(){
            int number1 = 20;
            int number2 = 30;
            int sum = number1/number2;
            System.err.println("The ");
        }

    }
    class MyCalcutor2 extends Calcutor{
        void add(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number1:");
            int number1 = s. nextInt();
            System.out.println("Enter the first number2:");
            int number2 = s.nextInt();
            int sum = number1+number2;
            System.out.println("The sum is :"+ sum);
        }
        void sub(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number1:");
            int number1 = s. nextInt();
            System.out.println("Enter the first number2:");
            int number2 = s.nextInt();
            int diff = number1-number2;
            System.out.println("The sum is :"+ diff);
        }
        void mul(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number1:");
            int number1 = s. nextInt();
            System.out.println("Enter the first number2:");
            int number2 = s.nextInt();
            int mul = number1*number2;
            System.out.println("The sum is :"+ mul);
        }
        void div(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number1:");
            int number1 = s. nextInt();
            System.out.println("Enter the first number2:");
            int number2 = s.nextInt();
            int div = number1/number2;
            System.out.println("The sum is :"+ div);
        }
    }
 class Math{
    void arithmetic(Calcutor c){
        c.add();
        c.sub();
        c.mul();
        c.div();

    }
 }
public class Calculator {
    public static void main(String[] args) {
        MyCalcutor m1 = new MyCalcutor();
        MyCalcutor2 m2 = new MyCalcutor2();
        Math m = new Math();
        m.arithmetic(m1);
        System.out.println("---------");
        m.arithmetic(m2);
        
    }
}