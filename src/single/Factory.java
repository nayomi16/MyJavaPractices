package single;

public class Factory {

    public static Vehicle getVehile(String name){
        if(name.equals("Car")){
            return new Car();
        }
        else if (name.equals("Bus")){
            return new Bus();
        }
        return null;
    }

}
