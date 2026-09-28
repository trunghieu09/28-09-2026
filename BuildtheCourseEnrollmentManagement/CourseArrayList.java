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
public class CourseArrayList {

    ArrayList<Course> courses = new ArrayList<>();

    public void addCourseToArrayList(Course course) {
        courses.add(course);
    }

    public void updateCourseById(String id) {
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.getId().equalsIgnoreCase(id)) {
                course.updateCourse();
                System.out.println("update successfully!");
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void deleteCourseById(String id) {
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.getId().equalsIgnoreCase(id)) {
                courses.remove(i);
                System.out.println("delete successfully!");
                return;
            }
        }
        System.out.println("Not found!");
    }

    public void displayAllCourse() {
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            course.displayDetails();
        }
    }

    public void displayAvailableCourses() {
        boolean found = false;
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.isIsAvailable()) {
                course.displayDetails();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No available courses!");
        }
    }

    public double calculateTotalFees() {
        double total = 0;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.isEmpty()) {
                return 0;
            }
            Course course = courses.get(i);
            total += course.calculateTotalFee();
        }
        return total;
    }
}
