public class Circle implements Shape{
    int radius;
    public void calculate(){
        System.out.println("Calculating Circle");
        System.out.println(radius * radius * 3.14);
    }
}
