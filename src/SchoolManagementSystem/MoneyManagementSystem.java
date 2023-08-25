package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class MoneyManagementSystem {
//contains an arrayList of teachers and students
//money earned is from the students while money spent is spent on paying teachers salary

    private List<Teacher> teacher;
    private List<Student> student;
    private static double moneyEarned;
    private static double moneySpent;


    public MoneyManagementSystem(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        moneyEarned = 0;
        moneySpent = 0;
    }

    public static void totalMoneyEarned(double moneyIn) {
        moneyEarned += moneyIn;
        System.out.println("Total income = " + moneyEarned);
    }


    public static void totalMoneySpent(double moneyOut) {
        moneySpent += moneyOut;
        System.out.println("Total expenditure = " + moneySpent);
    }

    //show net
    public void netIncome(){
        double netIncome = moneyEarned - moneySpent;
        System.out.println("Net income = " + netIncome);
    }
    //method to add students
    public void addStudents(Student stude){
        student.add(stude);
    }
    //add teacher
    public void addTeacher(Teacher mwalimu){
        teacher.add(mwalimu);
    }
    //getters and setters

    public List<Teacher> getTeacher() {
        return teacher;
    }


    public List<Student> getStudent() {
        return student;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    @Override
    public String toString() {
        return "MoneyManagementSystem{" +
                "teacher=" + teacher +
                ", student=" + student +
                ", moneyEarned=" + moneyEarned +
                ", moneySpent=" + moneySpent +
                '}';
    }
}
