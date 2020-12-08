import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

class demo{
    public static void main(String[] args) {
        StackOverflow stackOverflow=new StackOverflow();
        System.out.println(stackOverflow.id);

    }
}

class StackOverflow {

    public static final int id=10;


    static {
        System.out.println("static block");
    }
}
