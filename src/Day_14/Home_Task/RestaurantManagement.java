package Day_14.Home_Task;

class ChefThread extends Thread {

    public void run() {
        System.out.println(getName() + " : Making Noodles");
        System.out.println(getName() + " : Preparing Fried Rice");
        System.out.println(getName() + " : Packing Food");
    }
}

class WaiterThread extends Thread {

    public void run() {
        System.out.println(getName() + " : Serving Table 1");
        System.out.println(getName() + " : Serving Table 2");
        System.out.println(getName() + " : Taking New Order");
    }
}

class CashierThread extends Thread {

    public void run() {
        System.out.println(getName() + " : Generating Bill for Table 1");
        System.out.println(getName() + " : Collecting Payment");
        System.out.println(getName() + " : Printing Receipt");
    }
}

public class RestaurantManagement {

    public static void main(String[] args) {

        ChefThread chef = new ChefThread();
        WaiterThread waiter = new WaiterThread();
        CashierThread cashier = new CashierThread();

        chef.setName("Chef Thread");
        waiter.setName("Waiter Thread");
        cashier.setName("Cashier Thread");

        chef.start();
        waiter.start();
        cashier.start();
    }
}
