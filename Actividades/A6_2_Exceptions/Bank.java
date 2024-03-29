package Actividades.A6_2_Exceptions;

/**
 * Bank
 */
public class Bank {
    protected double balance;
    public Bank(){}
    public Bank(double initialBalance){
        balance = initialBalance;
    }
    public double withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException(amount-balance);
        }
        return balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}