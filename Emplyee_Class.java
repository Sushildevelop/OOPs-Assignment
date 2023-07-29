package Practice.Oops.Assignment;

class Employee{
    String name;
    int year;
    int salary;
    String address;
    public Employee(String n,int y,String add){
        name=n;
        year=y;

        address=add;
    }
}



public class Emplyee_Class {
    public static void main(String[] args) {
        Employee emp1=new Employee("Robert",1994,"64C-wallsStreet");
        Employee emp2=new Employee("Sam",2000,"68D-wallsStreet");
        Employee emp3=new Employee("John",1999,"26B-wallsStreet");
        System.out.println("Name"+"\t"+"Year of Joinig"+"\t"+"Address");
        System.out.println(emp1.name+"\t"+emp1.year+"\t\t\t"+emp1.address);
        System.out.println(emp2.name+"\t\t"+emp2.year+"\t\t\t"+emp2.address);
        System.out.println(emp3.name+"\t"+emp3.year+"\t\t\t"+emp3.address);

    }
}
