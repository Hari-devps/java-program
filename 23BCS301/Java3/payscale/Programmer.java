package payscale;

public class Programmer extends Employee {
    public Programmer() {
        super();
        computeProgrammerPay();
    }

    public void computeProgrammerPay() {
        System.out.print("Enter Basic Pay of Programmer [enter -1 for Default (BP = 30000)]: ");
        basic_pay = input.nextInt();
        if (basic_pay == -1) {
            basic_pay = 30000;
            System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Programmer");
    }
}
