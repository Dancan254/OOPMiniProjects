package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private static int id = 40001743;
    private int objId;
    private double schoolFeesBalance;
    private double feesPaid;
    private String Grade;
    private List<String> coursesEnrolled;


    //not going to alter the name and id hence no need of setters for the same

    public Student(String name,String aClass) {
        this.name = name;
        this.objId = id++;
        this.feesPaid = 0;//initially set the fees paid to zero
        this.coursesEnrolled = new ArrayList<>();
        Grade = aClass;
        //establish three gradeLevels, lower, middle, and upper each having different school fees,
        if (Grade.equalsIgnoreCase("Lower")) {
            this.schoolFeesBalance = 9000;
        }

        else if (Grade.equalsIgnoreCase("Middle")) {
            this.schoolFeesBalance = 13000;
        }
        else if (Grade.equalsIgnoreCase("Upper")) {
        this.schoolFeesBalance = 17500;
        }else {

            System.out.println("Class does not exist");
            }

    }

    //getters


    public int getObjId() {
        return objId;
    }

    //method for paying fees
    //takes in an amount
    public void payFees(double amountPaid){
        //check if the amount is less than zero
        if (amountPaid < 0){
            System.out.println("Invalid amount");
            return;
        }
        feesPaid += amountPaid;
        schoolFeesBalance -= feesPaid;
        if (schoolFeesBalance <= 0){
            System.out.println("You have successfully cleared your fee\nRevise thoroughly for the coming exams");
        } else if (schoolFeesBalance > 0 && schoolFeesBalance <= 4500){
            System.out.printf("Paid half of the fees, expected to clear the remaining amount of %.2f by the end of this month%n", schoolFeesBalance);
        } else {
            System.out.println("Make sure you pay half of the fees before the end of the week\nFailure to which you will be sent home");
        }
        checkBalance();
        MoneyManagementSystem.totalMoneyEarned(feesPaid);

    }
    //method to check current fee balance
    public void checkBalance(){
        System.out.println("Current Balance: " + schoolFeesBalance);
    }
    //method to enroll in a course
    //takes a course and adds it to the list
    public void enrollCourse(String course){
        coursesEnrolled.add(course);
        System.out.println("Enrolled in: " + course);
    }

    //method to remove course
    public void deRegisterCourse(String courseName){
//        if (coursesEnrolled.contains(courseName)){
//            coursesEnrolled.remove(courseName);
//            System.out.println("Deregistered in: " + courseName);
//        }
//        else{
//            System.out.println(courseName + " not found");
//        }
        //iterate through the list
        Iterator<String> itr = coursesEnrolled.listIterator();
        boolean removed = false;
        while(itr.hasNext()){
            if (itr.next().equalsIgnoreCase(courseName)){
                itr.remove();
                System.out.println("Deregistered in: " + courseName);
                removed = true;
                break;
            }
        }

        if (!removed){
            System.out.println(courseName + " not found");
        }
    }

    //getters

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public double getSchoolFeesBalance() {
        return schoolFeesBalance;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public String getGrade() {
        return Grade;
    }

    public List<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    //
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", objId=" + objId +
                ", schoolFeesBalance=" + schoolFeesBalance +
                ", feesPaid=" + feesPaid +
                ", Grade='" + Grade + '\'' +
                ", coursesEnrolled=" + coursesEnrolled +
                '}';
    }
}
