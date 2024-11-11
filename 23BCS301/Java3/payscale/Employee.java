package payscale;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Employee {
    String emp_name;
    String emp_id;
    String emp_address;
    String emp_mail_id;
    String emp_mobile_no;
    int basic_pay;
    int per_day_pay;
    int current_basic_pay;
    int da, hra, pf, gross_pay;
    int net_pay;
    int no_of_days_in_current_month;
    int no_of_days_worked;
    Calendar cal;
    Scanner input;

    Employee() {
        input = new Scanner(System.in);
        cal = new GregorianCalendar();
        no_of_days_in_current_month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        getUserBasicDetails();
    }

    public void generatePaySlip() {
        da = (current_basic_pay * 97) / 100;
        hra = (current_basic_pay * 12) / 100;
        pf = (int) ((current_basic_pay * 10) / 100);
        gross_pay = current_basic_pay + da + hra;
        net_pay = gross_pay - pf;
    }

    public void displayPaySlip() {
        System.out.println("Name: " + emp_name);
        System.out.println("ID: " + emp_id);
        System.out.println("Address: " + emp_address);
        System.out.println("MailID: " + emp_mail_id);
        System.out.println("Mobile No: " + emp_mobile_no);
        System.out.println("\nEarnings");
        System.out.println("--------");
        System.out.println("BASIC Pay: " + current_basic_pay + " Rs");
        System.out.println("DA : " + da + " Rs");
        System.out.println("HRA : " + hra + " Rs");
        System.out.println("\nDeductions");
        System.out.println("----------");
        System.out.println("PF : " + pf + " Rs");
        System.out.println("GROSS Pay: " + gross_pay + " Rs");
        System.out.println("NET Pay: " + net_pay + " Rs");
    }

    public void getUserBasicDetails() {
        System.out.println("Enter Details");
        System.out.print("Name: ");
        emp_name = input.next();
        System.out.print("ID: ");
        emp_id = input.next();
        System.out.print("Address: ");
        emp_address = input.next();
        System.out.print("MailID: ");
        emp_mail_id = input.next();
        System.out.print("Mobile No: ");
        emp_mobile_no = input.next();
    }

    public void computeCurrentBasicPay(String empType) {
        per_day_pay = basic_pay / no_of_days_in_current_month;
        System.out.println("\nBasic Pay of " + empType + ": " + basic_pay + " for " + no_of_days_in_current_month + " days");
        System.out.println("Daily Basic Pay: " + per_day_pay + " Rs");

        System.out.print("Enter number of days worked by " + empType + ": ");
        no_of_days_worked = input.nextInt();

        if (no_of_days_worked <= no_of_days_in_current_month) {
            current_basic_pay = per_day_pay * no_of_days_worked;
            generatePaySlip();
            displayPaySlip();
        } else {
            System.out.println("Invalid number of days worked. Please enter a valid value.");
        }
    }

    protected void finalize() {
        input.close();
        System.exit(0);
    }
}
