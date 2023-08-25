package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
        Student student = new Student("ian","lower");

//        System.out.println(student.getObjId());
//
//        student.enrollCourse("Maths");
//        student.enrollCourse("English");
//        System.out.println(student);

        Student student2 = new Student("Dancan", "Upper");
//        System.out.println(student2.getObjId());

//        student2.enrollCourse("Maths");
//        student2.enrollCourse("English");
//        student2.enrollCourse("Science");
//        student2.enrollCourse("Cre");
//        student2.enrollCourse("Social Studies");
////        student2.deRegisterCourse("english");
//        student2.deRegisterCourse("cre");
//        student2.deRegisterCourse("Phyc");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);



        Teacher teacher = new Teacher("Mongs", "Mathematics");
        //System.out.println("Salary: " + teacher.getSalary());

        Teacher teacher2 = new Teacher("Mong", "Mathematics");
       // System.out.println("Salary: " + teacher.getSalary());

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher);
        teacherList.add(teacher2);


        MoneyManagementSystem money = new MoneyManagementSystem( teacherList, studentList);
        student.payFees(4000);
        student2.payFees(10000);

        System.out.println(teacher.getSalary());
        System.out.println(teacher2.getSalary());

        System.out.println("Total money earned: ");
        System.out.println("Total money spent: " );
        money.netIncome();

    }
}
