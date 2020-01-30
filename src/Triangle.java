public class Triangle extends Shape{
    private double side1, side2, side3;
    double area;
    double perimeter;
    public Triangle(String name){
        super(name);
    }
    public void setDimensions(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    @Override
    public void printDimensions(){
        System.out.println("Triangle's dimensions are Side1: "+ side1+ ", side2: "+ side2+ ",and side3: " + side3);
    }

    @Override
    public double getArea() {
        perimeter = (side1 + side2 + side3)/2;
        double temp = perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3);
        area = Math.sqrt(temp);
        return area;
    }
}
