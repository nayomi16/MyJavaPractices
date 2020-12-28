package IQ;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaFun {
    public static void main(String[] args) {

//        Function<Integer,Integer> f=i ->i*i;
//        System.out.println("squre of 2= "+f.apply(2));
//        System.out.println("squre of 5= "+f.apply(5));
//
//        Predicate<Integer> predicate=i ->i%2==0;
//        System.out.println(predicate.test(6));
//        System.out.println(predicate.test(7));
        A a=(int k)-> System.out.println("Lambda expression "+k);
        a.m1(5);

    }

}
@FunctionalInterface
interface A{
    public void m1(int a);


}