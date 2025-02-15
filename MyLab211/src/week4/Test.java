/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import week4.ManageStudents.Student;

/**
 *
 * @author Dang Thanh Tung
 */
public class Test {

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        ManageStudents ms = new ManageStudents();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Add student");
            System.out.println("2. Show all students");
            System.out.println("3. Find student by name");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Sort students by name");
            System.out.println("6. Report students");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter student ID: ");
                    String id = sc.nextLine();

                    System.out.println("Enter name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter semester: ");
                    String semester = sc.nextLine();

                    System.out.println("Enter course name: ");
                    String coursename = sc.nextLine();

                    Student st = new Student(id, name, semester, coursename);
                    if (sm.addStudents(st)) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Failed to add student");
                    }

                    break;
                }
                case 2: {
                    System.out.println("\n--- Student List ---");
                    sm.showStudents();

                    break;
                }
                case 3: {
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    List<Student> foundStudents = sm.findStudents(searchName);
                    if (!foundStudents.isEmpty()) {
                        System.out.println("\n--- Found Students ---");
                        for (Student st : foundStudents) {
                            System.out.println(st);
                        }
                    } else {
                        System.out.println("No students found with name: " + searchName);
                    }
                    break;

                }
                case 4: {
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = sc.nextLine();
                    if (sm.deleteStudent(deleteId) == 1) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                }
                case 5: {
                    sm.sortStudents();
                    System.out.println("Students sorted by name.");
                    break;
                }
                case 6: {
                    System.out.println("\n--- Student Report ---");
                    sm.reportStudent();
                    break;
                }
                case 7: {
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                }
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}
