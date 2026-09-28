/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvutrunghieu_2738.BuildtheCourseEnrollmentManagement;

import java.util.Date;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse() {
    }

    public OnlineCourse(String platformName, double discountPercent) {
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public OnlineCourse(String platformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("platform name: " + this.getPlatformName());
        System.out.println("discount percent: " + this.getDiscountPercent());
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("platform name: ");
        setPlatformName(sc.nextLine());
        System.out.println("discount percent: ");
        setDiscountPercent(sc.nextDouble());
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("platform name: ");
        setPlatformName(sc.nextLine());
        System.out.println("discount percent: ");
        setDiscountPercent(sc.nextDouble());
    }

    @Override
    public double calculateTotalFee() {
        return this.getFeePerStudent() * this.getEnrolledStudents() * (1 - this.getDiscountPercent() / 100);
    }
}
