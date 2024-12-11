/*Design and develop inheritance for a given case study, identify objects and relationships and implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary
*/

// Base class Employee
class Employee {
    String empName, empId;
    double basicPay;

    // Constructor to initialize employee details
    Employee(String empName, String empId, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.basicPay = basicPay;
    }

    // Method to calculate and display pay slip
    void generatePaySlip() {
        double da = 0.97 * basicPay; // Dearness Allowance (97% of BP)
        double hra = 0.10 * basicPay; // House Rent Allowance (10% of BP)
        double pf = 0.12 * basicPay; // Provident Fund (12% of BP)
        double staffClubFund = 0.001 * basicPay; // Staff Club Fund (0.1% of BP)
        double grossSalary = basicPay + da + hra; // Gross salary
        double netSalary = grossSalary - (pf + staffClubFund); // Net salary

        System.out.println("\nPay Slip for " + empName + " (" + empId + ")");
        System.out.println("---------------------------------------------");
        System.out.printf("Basic Pay (BP): %.2f\n", basicPay);
        System.out.printf("Gross Salary: %.2f\n", grossSalary);
        System.out.printf("Net Salary: %.2f\n", netSalary);
        System.out.println("---------------------------------------------");
    }
}

// Derived class Programmer
class Programmer extends Employee {
    Programmer(String empName, String empId, double basicPay) {
        super(empName, empId, basicPay);
    }
}

// Derived class TeamLead
class TeamLead extends Employee {
    TeamLead(String empName, String empId, double basicPay) {
        super(empName, empId, basicPay);
    }
}

// Derived class AssistantProjectManager
class AssistantProjectManager extends Employee {
    AssistantProjectManager(String empName, String empId, double basicPay) {
        super(empName, empId, basicPay);
    }
}

// Derived class ProjectManager
class ProjectManager extends Employee {
    ProjectManager(String empName, String empId, double basicPay) {
        super(empName, empId, basicPay);
    }
}

// Main class
public class Practical7 {
    public static void main(String[] args) {
        // Create employees
        Programmer programmer = new Programmer("Alice", "P001", 50000);
        TeamLead teamLead = new TeamLead("Bob", "TL001", 70000);
        AssistantProjectManager apm = new AssistantProjectManager("Charlie", "APM001", 90000);
        ProjectManager pm = new ProjectManager("David", "PM001", 100000);

        // Generate pay slips
        programmer.generatePaySlip();
        teamLead.generatePaySlip();
        apm.generatePaySlip();
        pm.generatePaySlip();
    }
}
