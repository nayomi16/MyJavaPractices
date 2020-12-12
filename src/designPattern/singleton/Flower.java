package designPattern.singleton;

public class Flower {

    private static Flower flower=null;
    private Flower() {
        System.out.println("flower");
    }

    public static Flower getInstanse(){
        if(flower==null){
            synchronized (Flower.class){
                if(flower==null){
                    flower=new Flower();

                }
            }

        }
        return flower;
    }
}
