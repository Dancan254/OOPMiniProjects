package SchoolManagementSystem;

public class Teacher {
    private String FullName;
    private static int id = 29511;
    private int idGen;
    private int salary;
    private String department;


    public Teacher(String fullName,String department) {
        FullName = fullName;
        idGen = id;
        id++;
        this.department = department;
        //salary depends with the department

        if (department.equalsIgnoreCase("Mathematics")){
            salary = 4500;
            //MoneyManagementSystem.totalMoneySpent(salary);
        } else if (department.equalsIgnoreCase("Sciences")) {
            salary = 4300;
            //MoneyManagementSystem.totalMoneySpent(salary);
        }
        else if (department.equalsIgnoreCase("Humanities")) {
            salary = 4200;
           // MoneyManagementSystem.totalMoneySpent(salary);
        }
        else if (department.equalsIgnoreCase("Languages")) {
            salary = 4000;

        }
        else{
            System.out.println("Department does not exist!!");
        }
        MoneyManagementSystem.totalMoneySpent(salary);
    }

    //getters

    public String getFullName() {
        return FullName;
    }

    public static int getId() {
        return id;
    }

    public int getIdGen() {
        return idGen;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    //

    @Override
    public String toString() {
        return "Teacher{" +
                "FullName='" + FullName + '\'' +
                ", idGen=" + idGen +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
