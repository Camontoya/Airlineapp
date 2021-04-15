package airlineapp.EmployeeManagement;

import airlineapp.Login.LoginSession;
import javax.swing.JOptionPane;

public class EmployeePayment {
    double workHours = 8;
    double salPerHour = 3000.00;
    double salary = (salPerHour * workHours);
    double taxes = 0.105  * salary;
    double comission = 0.10 * salary;
    double total = salary - (taxes + comission);    

    public double adminPayment() {
        return total * 1.20;
    }

    public void showVendorSalary() {
        JOptionPane.showMessageDialog(null,
                "\nSalary per hour " + salPerHour
                + "\nWorked hours: " + workHours
                + "\nTaxes: " + taxes + " (10.5%)"
                + "\nComissions: " + comission + " (10%)"
                + "\nNet salary: " + salary
                + "\nTotal daily salary: " + total);
    }

    public void showAdminSalary() {
        JOptionPane.showMessageDialog(null,
                "\nSalary per hour " + salPerHour
                + "\nWorked hours: " + workHours
                + "\nTaxes: " + taxes + " (10.5%)"
                + "\nComissions: " + comission + " (10%)"
                + "\nNet salary: " + salary
                + "\nBonus per seniority: +20%"
                + "\nTotal dayli salary: " + adminPayment());
    }

    public void showSalary() {
        if (LoginSession.access == 0) {
            showAdminSalary();
        } else {
            showVendorSalary();
        }
    }
}
