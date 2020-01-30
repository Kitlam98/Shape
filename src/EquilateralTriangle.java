public class EquilateralTriangle extends Triangle{


    private double side;
    double area;

    public EquilateralTriangle( String name) {
        super(name);
    }
    public void setDimensions(double side){
        this.side = side;
    }

    @Override
    public void printDimensions() {
        System.out.println("EquilateralTriangle's dimensions with all three sides the same are "+ side);
    }

    @Override
    public double getArea() {
        double temp = Math.sqrt(3) * Math.pow(side,2);
        area = temp / 4;
        return area;
    }
}
