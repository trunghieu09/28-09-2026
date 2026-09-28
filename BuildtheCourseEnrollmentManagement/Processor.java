/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvutrunghieu_2738.BuildtheCourseEnrollmentManagement;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseArrayList a = new CourseArrayList();
        int nhap;
        do {
            System.out.println("1.	Add an OnlineCourse or OfflineCourse.\n"
                    + "2.	Update a course by ID.\n"
                    + "3.	Delete a course by ID.\n"
                    + "4.	Display all courses.\n"
                    + "5.	Display courses open for enrollment.\n"
                    + "6.	Calculate and display the total fees for all courses.\n"
                    + "7.	Exit the program.");
            System.out.println("Enter an option: ");
            nhap = sc.nextInt();
            sc.nextLine();
            switch (nhap) {
                case 1: {
                    System.out.println("1.online | 2.offline ");
                    int enter = sc.nextInt();
                    sc.nextLine();
                    if (enter == 1) {
                        OnlineCourse online = new OnlineCourse();
                        online.addCourse();
                        a.addCourseToArrayList(online);
                    } else if (enter == 2) {
                        OfflineCourse offline = new OfflineCourse();
                        offline.addCourse();
                        a.addCourseToArrayList(offline);
                    } else {
                        System.out.println("Wrong option!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter id to update: ");
                    String id = sc.nextLine();
                    a.updateCourseById(id);
                    break;
                }
                case 3: {
                    System.out.println("Enter id to delete: ");
                    String id = sc.nextLine();
                    a.deleteCourseById(id);
                    break;

                }
                case 4: {
                    a.displayAllCourse();
                    break;
                }
                case 5: {
                    System.out.println("available course: ");
                    a.displayAvailableCourses();
                    break;
                }
                case 6: {
                    double total = a.calculateTotalFees();

                    System.out.println("Total fees: " + total);

                    break;
                }
                case 7: {
                    System.out.println("Exit!");
                }
            }
        } while (nhap != 7);
    }
}
