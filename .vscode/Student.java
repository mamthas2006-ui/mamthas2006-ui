
class Main {

    // Data members (variables)
    int id;
    String name;
    int marks;

    // Method to display student details
    void display() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
        System.out.println("--------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();
        Student s2 = new Student();

        // Assign values to object s1
        s1.id = 101;
        s1.name = "Mamtha";
        s1.marks = 85;

        // Assign values to object s2
        s2.id = 102;
        s2.name = "Kanishka";
        s2.marks = 92;

        // Method call using object
        s1.display();
        s2.display();
    }
}