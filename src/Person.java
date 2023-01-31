import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public Person() {
        
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public String getAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return String.valueOf(age);
    }

    public String getAge(int year) {
        int age = year - YOB;
        return String.valueOf(age);
    }
}
class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String name, int age) {
        super(name, age);
        this.hourlyPayRate = hourlyPayRate;
    }


    public Worker(String name, int i, int i1, double pay) {

    }

    public Worker() {

    }

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay;

        if (hoursWorked <= 40) {
            totalPay = hoursWorked * hourlyPayRate;
        }

        else {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            double regularPay = 40 * hourlyPayRate;
            totalPay = overtimePay + regularPay;
        }
        return totalPay;
    }
    public String displayWeeklyPay(double hoursWorked) {
        double totalPay;
        double regularHours;
        double overtimeHours;
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            totalPay = hoursWorked * hourlyPayRate;
            regularHours = hoursWorked;
            overtimeHours = 0;
            regularPay = totalPay;
            overtimePay = 0;
        }
        else {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            regularPay = 40 * hourlyPayRate;
            totalPay = overtimePay + regularPay;
            regularHours = 40;
            regularPay = regularHours * hourlyPayRate;
            overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        }

        return "Regular Hours: " + regularHours + " hours, Regular Pay: $" + regularPay
                + "\nOvertime Hours: " + overtimeHours + " hours, Overtime Pay: $" + overtimePay
                + "\nTotal Pay: $" + totalPay;
    }

    public boolean getName() {
        return false;
    }
}
class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String name, int idNumber, double annualSalary){
        super(name,idNumber);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String name, int idNumber, int annualSalary, double v) {
        super();
    }

    public double calculateWeeklyPay(double hoursWorked){
        double weeklyPay = annualSalary/52;
        return weeklyPay;
    }

    public void displayWeeklyPay(){
        double weeklyPay = calculateWeeklyPay(0);
        System.out.println("This is a fraction of the yearly salary: "+weeklyPay);
    }
}
