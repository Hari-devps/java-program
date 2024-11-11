package payscale;

public class AssociateProfessor extends Employee {
    public AssociateProfessor() {
        super();
        computeAssociateProfessorPay();
    }

    public void computeAssociateProfessorPay() {
        System.out.print("Enter Basic Pay of Associate Professor [enter -1 for Default (BP = 40000)]: ");
        basic_pay = input.nextInt();
        if (basic_pay == -1) {
            basic_pay = 40000;
            System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Associate Professor");
    }
}
