package payscale;

public class AssistantProfessor extends Employee {
    public AssistantProfessor() {
        super();
        computeAssistantProfessorPay();
    }

    public void computeAssistantProfessorPay() {
        System.out.print("Enter Basic Pay of Assistant Professor [enter -1 for Default (BP = 25000)]: ");
        basic_pay = input.nextInt();
        if (basic_pay == -1) {
            basic_pay = 25000;
            System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Assistant Professor");
    }
}
