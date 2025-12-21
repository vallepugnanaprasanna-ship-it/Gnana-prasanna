import java.util.*;
/*String class--->
 	* String object is immutable(not changeable).
 
 * StringBuffer class--->
 	* StringBuffer class is mutable 
 	
 *Every method is synchronized
 *jdk 1.2
 *Thread safety
 *
 *performance wise not recommended to use this string buffer object
 */
public class StringExample {
          public static void main(String[] args){
                   /* String s= new String("vallepu");
                    System.out.println(s);
                    s.concat("prasanna");
                    System.out.println(s);
                    StringBuffer sb = new StringBuffer("prasanna");
                    System.out.println(sb);
                    sb.append("prasanna");
                    System.out.println(sb);*/
                    StringBuffer sb = new StringBuffer("prasanna");
                    System.out.println(sb);
                    sb.append("prasanna");
                    System.out.println(sb);
          }
}
