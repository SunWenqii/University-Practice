public class Run {
    public static void main(String[] args) {
        View ve = new View();
        Family familys[] = new Family[5];

        //家庭0测试
        familys[0] = ve.creatFamily();
        System.out.println(ve.creatLandShape(familys[0], 1, "圆形"));
        System.out.println(ve.creatLandShape(familys[0], 2, "矩形"));
        System.out.println(familys[0].getAverangeArea());
        System.out.println(familys[0].getS1() instanceof Circle);
        System.out.println(familys[0].getS2().toString());

        //家庭1测试
        Shape s1 = ve.creatRectangle();
        Shape s2 = ve.creatTriangle();
        familys[1] = new Family(3, s1, s2);
        ((Rectangle)familys[1].getS1()).setX(99);
        System.out.println(familys[1].getS1().getClass());
        System.out.println(((Rectangle) familys[1].getS1()).getX());

    }
}