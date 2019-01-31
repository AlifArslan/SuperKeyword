package superkeyword;

class Person {

    int id;
    String name;
    float pie = 2.14f;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        System.out.println("Parent Class 0 - arg Constructor : ");
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}

class Student extends Person {

    int rollNo;
    int obtainedMarks;

    public Student(int sid, String sname, int rollNo, int obtainedMarks) {
        super(sid, sname);
        this.rollNo = rollNo;
        this.obtainedMarks = obtainedMarks;
    }

    void displayStudentResult() {
        System.out.println("\nStudent Record :");
        super.display();
        System.out.println("Roll No : " + rollNo);
        System.out.println("Obtained Marks : " + obtainedMarks);
    }
}

class Employee extends Person {

    int salary;

    public Employee(int eid, String ename, int salary) {
        super(eid, ename);
        this.salary = salary;
    }

    void displayEmployeeResult() {
        System.out.println("\nEmployee Record :");
        super.display();
        System.out.println("Employee Salary : " + salary);
    }
}

public class Call_Parent_Constructor_Example {

    public static void main(String[] args) {
        // TODO code application logic here

        Student std = new Student(111, "Arslan", 39, 905);
        std.displayStudentResult();
        
        Employee emp = new Employee(001, "Zeeshan Ali", 500000);
        emp.displayEmployeeResult();

    }
}
