package IQ;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {
        String str="java is is best best lang lang";

        String[] arr=str.split(" ");
        Map<String, Integer> map=new java.util.HashMap<>();
        for (String s:arr) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            } else{
                map.put(s,1);
            }
        }


        for (String key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key+ "= "+map.get(key));
            }

        }
    }
}
