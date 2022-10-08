public class Rectangle extends Shape {   //矩形

    private double x, y;

    public Rectangle() {
        super("矩形");
    }

    public Rectangle(double x, double y) {
        super("矩形");
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double getAera() {
        return x * y;
    }

}