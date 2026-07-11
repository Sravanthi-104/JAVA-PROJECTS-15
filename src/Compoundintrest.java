import java.util.Scanner;
public class Compoundintrest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principle;
        double rate;
        int timescompounded;
        int years;
        double amount;
        System.out.print("Enter the value of the principle: ");
        principle = sc.nextDouble();
        System.out.print("Enter the rate in (%): ");
        rate = sc.nextDouble();
        rate = rate/100;
        System.out.print("Enter the no.of times componded :");
        timescompounded = sc.nextInt();
        System.out.print("Enter the no.of years: ");
        years = sc.nextInt();
        amount = principle * Math.pow(( 1 + rate/timescompounded) , timescompounded*years );
        System.out.printf("The compound intrest is: %.2f", amount);
        sc.close();


    }
}