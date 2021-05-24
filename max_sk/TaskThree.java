package max_sk;

public class TaskThree {
    public static void info(Figura figura){
        System.out.println(figura.area());
    }

    public static void main(String[] args) {
        Figura figura = new Circle(5.5);
        info(figura);
        figura = new Square(25);
        info(figura);
        figura = new Triangle(5);
        info(figura);
    }
}

interface Figura{
    final double P = 3.14;
    double area();
}

class Circle implements Figura{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return P * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }
}


class Square implements Figura{

    private double said;

    public Square(double said) {
        this.said = said;
    }

    @Override
    public double area() {
        return said * said;
    }

    public double getSaid() {
        return said;
    }
}

class Triangle implements Figura{

    private double said;

    public Triangle(double said) {
        this.said = said;
    }

    public double area() {
        double p = (said + said + said) / 2;
        return Math.sqrt(p * (p - said) * (p - said) * (p - said));
    }

    public double getSaid(){
        return said;
    }

}
