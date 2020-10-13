package chapter6;

public class PhoneBill {

    private int id;
    private double planFee;
    private double planMinutes;
    private double minutesUsed;

    // Constructors

    public PhoneBill(){
        id = 0;
        planFee = 80;
        planMinutes = 800;
        minutesUsed = planMinutes;
    }

    public PhoneBill(int id){
        this.id = id;
        planFee = 80;
        planMinutes = 800;
        minutesUsed = planMinutes;
    }

    public PhoneBill(int id, double fee, double minutes, double minutesUsed){
        this.id = id;
        this.planFee = fee;
        this.planMinutes = minutes;
        this.minutesUsed = minutesUsed;
    }

    // Getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPlanFee() {
        return planFee;
    }

    public void setPlanFee(double planFee) {
        this.planFee = planFee;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double getPlanMinutes() {
        return planMinutes;
    }

    public void setPlanMinutes(double planMinutes) {
        this.planMinutes = planMinutes;
    }

    // methods

    public double calculateOverageMinutesCost(){
        double overageMinuteCost = 0.25;
        if (minutesUsed <= planMinutes) {
            return 0;
        }
        return (minutesUsed - planMinutes) * overageMinuteCost;
    }

    public double calculateUserTaxes() {
        double taxRate = 0.15;
        return (calculateOverageMinutesCost() + planFee) * taxRate;
    }

    public double calculateBillTotal(){
        return planFee + calculateOverageMinutesCost() + calculateUserTaxes();
    }

    public void printUserBill() {
        System.out.println("[*] Phone Bill Statement:");
        System.out.printf("[-] Plan Cost: $%.2f %n", planFee); // %d is for integers use %f
        // instead, it works for both float and double types:
        System.out.printf("[-] Overage Minutes: $%.2f %n", calculateOverageMinutesCost());
        System.out.printf("[-] Taxes: $%.2f %n", calculateUserTaxes());
        System.out.printf("[-] Total: $%.2f %n", calculateBillTotal());
    }
}
