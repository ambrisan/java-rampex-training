package Day_13.class_task;

public class Bank {

    public static void main(String [] args){

        SibAccount s1=new SibAccount();
        // System.out.println(s1.checkBalance());

        try {
            s1.deposit(-5);
        }


        catch(ArithmeticException e){

            System.out.println("Enter positive amount value");
        }

    }

}

//Rbi tells only what to do, so its abstract

interface rib{
    //bank should have these features;

    public void  deposit(float amount);

    public void withdraw(float withdraw);

    public void checkBalance();
}

class SibAccount implements rib{

    private  String accName;
    private int accId;
    private  float balance;
    private float fdBalance;
    private float max_amount =10000;


    // ---------------------------- getters

    public float getMax_amount(){

        return max_amount;
    }

    public void setMax_amount(float amount ){

        max_amount =amount;
    }


    public String getName(){

        return accName;
    }

    public int getAccId(){

        return accId;
    }
    public float  getBalance(){
        return balance;


    }



//---------------------setters

    public void setName(String Name){

        accName =Name;

    }
    public void setAccId(int id){

        accId=id;
    }
    public void setBalance(float balance){

        this.balance=balance;
    }



    public void deposit(float amount , int accCode){

        fdBalance=fdBalance+amount;

        System.out.println("Amount deposited in fd Account " +amount +
                "Remaining FD balance :" + fdBalance);



    }





    public void deposit(float amount ){



        if (amount<0){

            throw new ArithmeticException();
        }
        balance = balance +amount;
        System.out.println("Amount deposited in  "+accName +"'s Account Rs:"
                + amount+
                " Remaining balance : "+balance);
    }
    //------------withdrawl

    //--need to handle negative amount
    // amount more than the limit


    public void withdraw(float amount){

        if (amount>=0 ) // valid amount
        {
            if (amount <=max_amount){   // under the limit check

                if (amount<=balance   ){

                    balance =balance-amount;
                    System.out.println("Amount withdrawn "
                            +accName +"'s Account Rs:"+ amount+
                            " Remaining balance : "+ balance) ;}
                else{
                    System.out.println("Insufficient funds !!!");

                }
            }
            else{
                System.out.println(" Entered amount exceeds the Limit");
            }
        }
        else {
            System.out.println("invalid amount !!! ");
        }
    }
    //--------------------

    public void checkBalance(){



        System.out.println(" main balance : "+ balance
                + "  Fd Balance "+ fdBalance);

    }



}

//--------------------------SbiAccount----------------



//------------------------SbiMinor Account----------------



////---------------------hdfc
//
//class hdfc   implements rbi{
//
//
//
//    String accName;
//    int accId;
//    float balance;
//
//    public void deposit(float amount ){
//
//        balance = balance +amount;
//        System.out.println("Amount deposited : "+ amount+
//                "Remaining balance : "+balance);
//
//
//    }
//
//    //------------withdrawl
//
//    public void withdraw(float amount){
//
//        balance =balance-amount;
//        System.out.println("Amount withdrawn "+ amount+
//                "Remaining balance : "+ balance) ;
//    }
//    //--------------------
//
//    public void checkBalance(){
//
//
//
//    }
//
//
//
//}