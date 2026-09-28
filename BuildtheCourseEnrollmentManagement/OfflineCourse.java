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
public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse() {
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent) {
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("classroom number: " + this.getClassroomNumber());
        System.out.println("material fee per student: " + this.getMaterialFeePerStudent());
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("classroom number: ");
        setClassroomNumber(sc.nextLine());
        System.out.println("material fee per student: ");
        setMaterialFeePerStudent(sc.nextDouble());
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("classroom number: ");
        setClassroomNumber(sc.nextLine());
        System.out.println("material fee per student: ");
        setMaterialFeePerStudent(sc.nextDouble());
    }

    @Override
    public double calculateTotalFee() {
        return (this.getFeePerStudent() + this.getMaterialFeePerStudent()) * this.getEnrolledStudents();
    }

}
