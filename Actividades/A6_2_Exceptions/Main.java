package Actividades.A6_2_Exceptions;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Bank b = new Bank(1000);
        b.deposit(1000);
        try{
            b.withdraw(5000);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.toString());
        }
        
        int[] array = new int[5];
        try{
            //array[6] = 20;
            int z = 10/0;
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}