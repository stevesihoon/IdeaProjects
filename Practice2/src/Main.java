public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Shape s = new Circle();

        Shape shape = new Shape() {
            @Override
            public void calculate() {
                System.out.println("interface object ");
            }
        };
        c.radius = 5;
 //       s.radius = 6;

        r.width = 8;
        r.height = 9;

        c.calculate();
        r.calculate();
        s.calculate();
        shape.calculate();
    }
}