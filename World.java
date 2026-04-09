import java.util.*;
import java.util.Scaner;
public class main{
    public static void main(string[] args){
        Scaner sc = new Scaner(System.in);
        System.out.println("enter your number:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("sum is"+(a+b));
        sc.close();
    }
}