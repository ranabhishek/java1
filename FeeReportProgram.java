import java.util.ArrayList;
import java.util.Scanner;

public class FeeReportProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Pay Fees");
            System.out.println("3. Generate Fee Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter total fees: ");
                    double feesTotal = scanner.nextDouble();
                    Student student = new Student(name, rollNumber, feesTotal);
                    students.add(student);
                    break;
                case 2:
                    System.out.print("Enter roll number of the student: ");
                    int rollToPay = scanner.nextInt();
                    System.out.print("Enter the amount to pay: ");
                    double amountToPay = scanner.nextDouble();
                    for (Student s : students) {
                        if (s.getRollNumber() == rollToPay) {
                            s.payFees(amountToPay);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Fee Report:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
