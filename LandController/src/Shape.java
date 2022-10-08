public abstract class Shape {
    private String name;
    public Shape() {
        super();
    }
    public Shape(String name) {
        super();
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public abstract double getAera(); //  获得图形总面积
}
