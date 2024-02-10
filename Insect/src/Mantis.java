public class Mantis extends Insect implements Locomotion{
    public Mantis(int size, String color){
        super(size, color);
    }
    public void move(){
        System.out.println("crawl");
    }
    public void attack(){
        System.out.println("strike");
    }
    public boolean pollinate(){
        return false;
    }
    public Grasshopper preyOn(){                    // ??
        return new Locust(3, "Brown");
    }

}
