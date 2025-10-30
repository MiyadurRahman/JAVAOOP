package exception_handling;

import javax.naming.InsufficientResourcesException;
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }





}
public class bank {
    private int balance;
    public bank(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    int withdraw(int amount) throws InsufficientFundException {//i need throws method to main func
        if(amount>balance){
            throw new InsufficientFundException("withdrwal amount exceeds current balance");


        }
        else{
            balance = balance - amount;
        }
        return balance;

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        bank bank = new bank(5000);
        try {
            bank.withdraw(6000);
        }catch(InsufficientFundException e){

            System.out.println(e.getMessage());
        }finally{
            System.out.println( "tansaction processing completed");
        }
    }
}
