package IQ;

import java.util.HashSet;
import java.util.Set;

public class Hashset {


    public static void main(String[] args) {

        String[] store={"A","B","H","A","B","C"};

        Set<String> set=new HashSet<String>();


        for(String name:store){
            if(set.add(name)==false){
                System.out.println(name);
            }
        }
    }



}
