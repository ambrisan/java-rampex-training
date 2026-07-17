package Day_13.class_task;
public class ExceptionalHandlingMethods {
        public static void main(String [] args){
            bankAccount b1 = new bankAccount();
            try {
                b1.deposit(-1);
            }catch(ArithmeticException e){
                System.out.println(e);
            }

        }
    }
    class bankAccount {
        private String accName;
        int accNo;
        private float balance;

        //Methods
        public void deposit(int amount) throws ArithmeticException {

            if(amount<0){
                throw new ArithmeticException();

            }
            balance = balance + amount;
            System.out.println(accName + "Amount Deposited " + amount + " Rs, " + "balance " + balance);
        }
        class InvalidAmountException extends Exception{
            InvalidAmountException() {
                super();
            }
        }
        class LowBalanceException extends Exception{
            LowBalanceException(){
                super();
            }
        }
        //Withdraw
        public void withdraw(float amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawed " + amount + " Rs, " + "balance " + balance);

        }

        public float checkBalance() {
            return balance;
        }

        public void setName(String name) {
            accName = name;
        }

        public String getName() {
            return accName;
        }
    }
//Public
//Private      ****Access Modifier
//Default
//Protected
