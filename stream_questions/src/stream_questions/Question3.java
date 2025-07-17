package stream_questions;
import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    String name;
    Date dob;
    String department;
    String designation;
    double salary;

    Employee(String name, Date dob, String department, String designation, double salary) {
        this.name = name;
        this.dob = dob;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Employee emp = new Employee("John", new Date(90, 4, 15), "IT", "Developer", 50000);

        try {
            // Serialize
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"));
            out.writeObject(emp);
            out.close();

            // Deserialize
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) in.readObject();
            in.close();

            // Print employee details
            System.out.println("Name: " + e.name);
            System.out.println("DOB: " + e.dob);
            System.out.println("Department: " + e.department);
            System.out.println("Designation: " + e.designation);
            System.out.println("Salary: " + e.salary);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
