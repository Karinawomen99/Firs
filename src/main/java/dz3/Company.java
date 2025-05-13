package dz3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;
    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;}
    public static void printCompanyName(){
        System.out.println( "Название компании:" + companyName);
    }
    String getEmployeeName(){return employeeName;}
    void  setCompanyName (String employeeName){this.employeeName = employeeName;}

    }

