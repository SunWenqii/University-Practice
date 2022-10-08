import java.util.Scanner;

public class View {   //输入、创建对象类

    public Family creatFamily(){   //创建家庭
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入家庭的成员数：");
        int num = sc.nextInt();
        Family family = new Family(num);
        return family;
    }

    public Circle creatCircle(){
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三角形半径：");
        r = sc.nextDouble();
        return new Circle(r);
    }

    public Rectangle creatRectangle(){
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入矩形的长度：");
        x = sc.nextDouble();
        System.out.print("请输入矩形的宽度：");
        y = sc.nextDouble();
        return new Rectangle(x, y);
    }

    public Triangle creatTriangle(){
        double a, b,c ;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三角形第一条边长：");
        a = sc.nextDouble();
        System.out.print("请输入三角形第二条边长：");
        b = sc.nextDouble();
        System.out.print("请输入三角形第三条边长：");
        c = sc.nextDouble();
        return new Triangle(a, b, c);
    }

    public boolean creatLandShape(Family family, int nb, String name){   //nb 代表第几块地 nb = 1 | 2
        if(nb != 1 && nb != 2) return false;
        if(nb == 1){
            if(name.equals("圆形") == true){
                family.setS1(this.creatCircle());
                return true;
            }else if(name.equals("矩形") == true){
                family.setS1(this.creatRectangle());
                return true;
            }else if(name.equals("三角形") == true){
                family.setS1(this.creatTriangle());
                return true;
            }else{
                return false;
            }
        }else if(nb == 2){
            if(name.equals("圆形") == true){
                family.setS2(this.creatCircle());
                return true;
            }else if(name.equals("矩形") == true){
                family.setS2(this.creatRectangle());
                return true;
            }else if(name.equals("三角形") == true){
                family.setS2(this.creatTriangle());
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

}
