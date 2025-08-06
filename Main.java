package studentCourseRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lists to store data
        ArrayList<student> students_array = new ArrayList<>();
        ArrayList<course> courses_array = new ArrayList<>();
        ArrayList<enrollment> enrollments_array = new ArrayList<>();

        int choice;

        do {
            // Menu options
            System.out.println("\n=== Student Course Registration Menu ===");
            System.out.println("1. Register Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. View All Students");
            System.out.println("5. View All Courses");
            System.out.println("6. View All Enrollments");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    // Register Student
                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Student Email: ");
                    String semail = sc.nextLine();
                    students_array.add(new student(sid, sname, semail));
                    System.out.println("✅ Student registered successfully!");
                    break;

                case 2:
                    // Add Course
                    System.out.print("Enter Course ID: ");
                    String cid = sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Instructor Name: ");
                    String instructor = sc.nextLine();
                    courses_array.add(new course(cid, cname, instructor));
                    System.out.println("✅ Course added successfully!");
                    break;

                case 3:
                    // Enroll Student
                    System.out.print("Enter Student ID to Enroll: ");
                    String esid = sc.nextLine();
                    System.out.print("Enter Course ID to Enroll In: ");
                    String ecid = sc.nextLine();
                    boolean studentExists = false;
                    boolean courseExists = false;

                    for (student s : students_array) {
                        if (s.getId().equals(esid)) {
                            studentExists = true;
                            break;
                        }
                    }

                    for (course c : courses_array) {
                        if (c.getcourse_Id().equals(ecid)) {
                            courseExists = true;
                            break;
                        }
                    }

                    if (studentExists && courseExists) {
                        String date = java.time.LocalDate.now().toString();
                        enrollments_array.add(new enrollment(esid, ecid, date));
                        System.out.println("✅ Enrollment successful!");
                    } else {
                        System.out.println("❌ Invalid Student ID or Course ID.");
                    }
                    break;

                case 4:
                    // View All Students
                    System.out.println("\n--- All Registered Students ---");
                    for (student s : students_array) {
                    	System.out.println("-----------*********---------------");
                        System.out.println("ID: " + s.getId());
                        System.out.println("Name: " + s.getName());
                        System.out.println("Email: " + s.getEmail());
                        System.out.println("-----------*********---------------");
                    }
                    break;
                case 5:
                    // View All Courses
                    System.out.println("\n--- All Available Courses ---");
                    for (course c : courses_array) {
                    	System.out.println("-----------*********---------------");
                        System.out.println("Course ID: " + c.getcourse_Id());
                        System.out.println("Name: " + c.getcourse_Name());
                        System.out.println("Instructor: "+ c.getInstructor());
                        System.out.println("-----------*********---------------");
                    }
                    break;

                case 6:
                    // View All Enrollments
                    System.out.println("\n--- All Enrollments ---");
                    for (enrollment e : enrollments_array) {
                    	System.out.println("-----------*********---------------");
                        System.out.println("Student ID: " + e.getStudent_Id());
                        System.out.println("Course_ID: " + e.getCourse_Id());
                        System.out.println("Date: "+ e.getDate_Of_Enrollment());
                        System.out.println("-----------*********---------------");
                    }
                    break;

                case 7:
                    System.out.println("👋 Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
