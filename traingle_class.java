package Practice.Oops.Assignment;

class Triangle{
    int side1, side2, side3;
    public double getAear(){
        double side=(side1+side2+side3)/2.0;
        return Math.pow((side*(side-side1)*(side-side2)*(side-side3)),.5);
    }
    public double getPerimeter(){
        return (side1+side2+side3)/2.0;
    }
}
public class traingle_class {
    public static void main(String[] args) {
          Triangle obj=new Triangle();
          obj.side1=2;
          obj.side2=5;
          obj.side3=6;
        System.out.println(obj.getAear());
        System.out.println(obj.getPerimeter());
    }
}
