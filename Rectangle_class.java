package Practice.Oops.Assignment;

import java.util.Scanner;

class Area{
    int length;
    int breadth;
    public Area(int l,int b){
        length=l;
        breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }
}



public class Rectangle_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length ");
        int l=sc.nextInt();
        System.out.println("Breath ");
        int b=sc.nextInt();
        Area a= new Area(l,b);
        System.out.println("Area : "+a.getArea());
    }
}
