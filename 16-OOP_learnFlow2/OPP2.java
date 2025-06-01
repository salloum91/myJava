public class OPP2 {

    //main Program Class
    public static void main(String[]args){
        //init the objects
        Engineer adminstration = new Engineer("John","Deep","Design","Team leader",6000.1);
        Worker  teamleader = new Worker("Calie","Morgan","Packing","Group Leader",2600.50);

        adminstration.checkedin();
        teamleader.checkedin();

    }

}
//super class
class Employee{
    //properties
    String firstName;
    String lastName;
    String department;
    String position;
    Double salary;

    //constructor
    public Employee (String firstName,String lastName,String department,String position,Double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        this.position=position;
        this.salary=salary;

    }

    //behavior
    public void checkedin(){
        System.out.println("the Employee checked in at '09:00 am'");
    }

}

//subclass
class Engineer extends Employee {
    public Engineer (String firstName,String lastName,String department,String position,Double salary){
        super(firstName,lastName,department,position,salary);
    }

    @Override
    public void checkedin() {
        super.checkedin();
    }
}

//subclass2
class Worker extends Employee{
    public Worker(String firstName,String lastName,String department,String position,Double salary){
        super(firstName,lastName,department,position,salary);
    }
    @Override
    public void checkedin(){
        System.out.println("the Worker "+ firstName +" "+ lastName +" checked in at '06:00 am'");
    }

}