/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvutrunghieu_2738.BuildtheCourseEnrollmentManagement;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Administrator
 */
public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public void addCourse() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("ID: ");
            setId(sc.nextLine());

            System.out.println("fee per student: ");
            setFeePerStudent(sc.nextDouble());
            sc.nextLine(); // thêm dòng này

            SimpleDateFormat pdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("start date: ");
            String date = sc.nextLine();
            setStartDate(pdf.parse(date));

            System.out.println("is available: ");
            setIsAvailable(sc.nextBoolean());

            System.out.println("enrolled student: ");
            setEnrolledStudents(sc.nextInt());
            sc.nextLine();

        } catch (Exception e) {
            System.out.println("Wrong format");
        }
    }

    @Override
    public void updateCourse() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("fee per student: ");
            setFeePerStudent(sc.nextDouble());
            sc.nextLine(); // thêm

            SimpleDateFormat pdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("start date: ");
            String date = sc.nextLine();
            setStartDate(pdf.parse(date));

            System.out.println("is available: ");
            setIsAvailable(sc.nextBoolean());

            System.out.println("enrolled student: ");
            setEnrolledStudents(sc.nextInt());
            sc.nextLine();

        } catch (Exception e) {
            System.out.println("Wrong format");
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat pdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId());
        System.out.println("fee per student: " + this.getFeePerStudent());
        System.out.println("start date: " + pdf.format(startDate));
        System.out.println("is available: " + this.isIsAvailable());
        System.out.println("enrolled student: " + this.getEnrolledStudents());
    }

    @Override
    public abstract double calculateTotalFee();
}
