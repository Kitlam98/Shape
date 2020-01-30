public class Circle extends Shape{
    private double Pi = 3.14;
    private double radius;
    double area;

    public Circle(String name){
        super(name);
    }
    public void setDimension(double radius){
        this.radius = radius;
    }
    @Override
    public void printDimensions(){
        System.out.println("Circle's dimension are radius:" + radius);
    }

    @Override
    public double getArea() {
        area = Pi * Math.pow(radius,2);
        return area;
    }
}