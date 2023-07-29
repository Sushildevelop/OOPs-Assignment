package Practice.Oops.Assignment;

class Student{
    int rollNo;
    String name;
}
public  class Create_simple_class {

    public static void main(String[] args) {
            Student obj1=new Student();
            obj1.rollNo=2;
            obj1.name="John";
        System.out.println("Name of student is "+obj1.name+" and roll number is "+obj1.rollNo);



    }
}
