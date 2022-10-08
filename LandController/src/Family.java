public class Family {
    private int num; //家庭成员数
    private Shape s1;
    private Shape s2;

    public Family() {
        super();
    }

    public Family(int num) {
        super();
        this.num = num;
    }

    public Family(int num, Shape s1, Shape s2) {
        super();
        this.num = num;
        this.s1 = s1;
        this.s2 = s2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Shape getS1() {
        return s1;
    }

    public void setS1(Shape s1) {
        this.s1 = s1;
    }

    public Shape getS2() {
        return s2;
    }

    public void setS2(Shape s2) {
        this.s2 = s2;
    }

    public double getAverangeArea(){
        return (s1.getAera() + s2.getAera()) / this.num;
    }
}
