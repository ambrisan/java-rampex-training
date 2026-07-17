package Day_13.class_task;

public class BankingTryCatch {
    //Abstraction is implemented, as what the RBI obtaining as float must be followed by other banks like SBI, hdfc
    public static void main(String [] args){
        SbiAccount s1 = new SbiAccount();
        //System.out.println(s1.checkBalance());
        try{
            s1.deposit(-5);
        }catch(ArithmeticException e){
            System.out.println("Enter a valid amount");
        }
        //s1.accName = "Hi";
        s1.deposit(1000);
        System.out.println(s1.getBalance());
        //System.out.println(s1.getName());
        //s1.accName="Raj";
        s1.setName("Nilan");
        System.out.println(s1.getName());
        s1.deposit(1000);
        //s1.deposit(1000, 2);
        s1.checkBalance();
        //s1.withdraw(1000);
        s1.withdraw(9100);
    }
}
//Rbi tells only what to do, so its abstract
interface rbi{
    public void deposit(float amount);
    public void withdraw(float withdraw);
    public float checkBalance();
    //public void checkBalance();
}
class SbiAccount implements rbi {
    //String accName;
    private String accName;
    //int accId;
    private int accId;
    //float balance;
    private float balance;
    //Getter and Setter
    private float fdBalance;
    //private void checkBalance;
    private float checkBalance;
    private float max_amount = 10000;

    public float getMax_amount() {
        return max_amount;
    }

    public float setMax_amount(float amount) {
        max_amount = amount;
        return max_amount;
    }

    public String getName() {
        return accName;
    }

    public int getAccId() {
        return accId;
    }

    public float getBalance() {
        return balance;
    }

    //    public void getcheckBalance(){return checkBalance;}
    public float getcheckBalance() {
        //System.out.println("Main Balance: " + balance + "Fd balance" + balance);
        return checkBalance;
    }

    //Setter
    public void setName(String Name) {
        //this.accName = accName;
        accName = Name;
    }

    public void setAccId(int id) {
        accId = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount, int acccode) {
        fdBalance = fdBalance + amount;
        System.out.println("Amount deposited in " + accName + ", Account Rs.: " + amount + " Remaining balance: " + fdBalance);
    }

    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Amount deposited in " + accName + ", Account Rs.: " + amount + " Remaining balance: " + balance);
    }

    //Need to handle negative amount
    //amount
    public void withdraw(float amount) {
        //if (amount <= balance && /*amount >= 0 && */amount <= max_amount)/*Valid Amount*/ {
        if (/*amount <= balance && */amount >= 0/* && amount <= max_amount*/) {
            if (amount <= max_amount) {
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount withdrawn: " + accName + ", Account Rs.: " + amount + "Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient Funds");
                }
            } else {
                System.out.println("Entered Amount exceed the Limit");
            }
        }else{
            System.out.println("Entered Amount is less /*more*/ than the Limit");
        }
    }
    //public void checkBalance(){
    //        System.out.println("Main Balance: " + balance + " Fd balance" + fdBalance);
    //
    //        return balance;
    //    }
    public float checkBalance() {
        System.out.println("Main Balance: " + balance + " Fd balance" + fdBalance);
        return balance;
    }
}

//SBI Minor Account


//class hdfc implements rbi{
//    String accName;
//    int accId;
//    float balance;
//    public void deposit(float amount){
//        balance = balance + amount;
//        System.out.print("Amount deposited: " + amount + "Remaining balance: " + balance);
//    }
//    public void withdraw(float amount){
//        balance = balance - amount;
//        System.out.print("Amount withdrawn: " + amount + "Remaining balance: " + balance);
//    }
//    public float checkBalance(){
//        return balance;
//    }
//}