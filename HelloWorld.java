import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Locale.getDefault(): " + Locale.getDefault());
        System.out.println("TimeZone.getTimeZone(America/New_York): " + TimeZone.getTimeZone("America/New_York"));
     }
}
