package payscale;

public class Professor extends Employee {
    public Professor() {
        super();
        computeProfessorPay();
    }

    public void computeProfessorPay() {
        System.out.print("Enter Basic Pay of Professor [enter -1 for Default (BP = 70000)]: ");
        basic_pay = input.nextInt();
        if (basic_pay == -1) {
            basic_pay = 70000;
            System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Professor");
    }
}
