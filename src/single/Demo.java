package single;

public class Demo {
    public static void main(String[] args) {
        /*Vehicle car = Factory.getVehile("Car");
        car.print();

        Vehicle bus= Factory.getVehile("Bus");
        bus.print();*/

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);

        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);
    }
}
