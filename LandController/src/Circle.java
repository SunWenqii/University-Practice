public class Circle extends Shape {  //圆形
    private double r;

    public Circle() {
        super("圆形");
    }

    public Circle(double r) {
        super("圆形");
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public double getAera() {
        return r * r * 3.14;
    }

}