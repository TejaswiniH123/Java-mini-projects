import java.util.Scanner;

interface Employee {
    void display();
}
class EmployeeImpl implements Employee {

    String name;
    int id;
    String designation;
    int experience;
    int age;

    EmployeeImpl(String name, int id, String designation, int experience, int age) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.experience = experience;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Experience: " + experience);
        System.out.println("Age: " + age);
        System.out.println("---------------------");
    }
}
// import java.util.Scanner;

 class Main {

    static final int MAX = 20;
    static EmployeeImpl[] emp = new EmployeeImpl[MAX];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Insert Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> insert();
                case 2 -> display();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void insert() {
        if (count >= MAX) {
            System.out.println("Employee table full");
            return;
        }

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Designation: ");
        String des = sc.next();

        System.out.print("Experience: ");
        int exp = sc.nextInt();

        System.out.print("Age: ");
        int age = sc.nextInt();

        emp[count++] = new EmployeeImpl(name, id, des, exp, age);
    }

    static void display() {
        for (int i = 0; i < count; i++) {
            emp[i].display();
        }
    }
}


//OUTPUT
Employee Management System
1. Insert Employee
2. Display Employees
3. Exit
2

Employee Management System
1. Insert Employee
2. Display Employees
3. Exit
1
Name: Teju
ID: 123
Designation: SDE
Experience: 2
Age: 20

Employee Management System
1. Insert Employee
2. Display Employees
3. Exit
1
Name: Priya
ID: 234
Designation: SDE
Experience: 3
Age: 31

Employee Management System
1. Insert Employee
2. Display Employees
3. Exit
2
Name: Teju
ID: 123
Designation: SDE
Experience: 2
Age: 20
---------------------
Name: Priya
ID: 234
Designation: SDE
Experience: 3
Age: 31
---------------------

Employee Management System
1. Insert Employee
2. Display Employees
3. Exit
3
