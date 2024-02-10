public class Bee extends Insect implements Locomotion, Pollination{
    private String swarm;                   // ??
    public Bee(int size, String color, String swarm){
        super(size, color);
        this.swarm = swarm;                 // ??
    }
    public String getSwarm(){
        return swarm;
    }
    @Override
    public void move() {
        System.out.println("fly");
    }
    public void attack(){
        System.out.println("sting");
    }
    public void makeHoney(){
        System.out.println("Orange Blossom");
    }

    @Override
    public boolean pollinate() {
        return true;
    }
    public boolean equals(Object o) {
        if (o == null || o.getClass() != o.getClass()) {
            return false;
        }

        Bee b = (Bee) o;

        return b.size == size && (b.color == color || b.color != null && b.color.equals(color)) && (b.swarm == swarm || b.swarm != null && b.swarm.equals(swarm));
    }

    public Object clone(){
//        try{
//            Bee b = (Bee) super.clone();
//            b.swarm = this.swarm;
//            return b;
//        }
//        catch (CloneNotSupportedException e){
//            return null;
//        }
        Bee b = new Bee(size, color, swarm);
        return b;
    }
}
