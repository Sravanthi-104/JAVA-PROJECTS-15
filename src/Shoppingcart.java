import java.util.Scanner;
public class Shoppingcart{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total = 0;
        System.out.print("Enter the item your going to buy:");
        item = sc.nextLine();
        System.out.print("Enter the price of item for each:");
        price = sc.nextDouble();
        System.out.print("Enter how many items did you buy:");
        quantity = sc.nextInt();
        total = price * quantity;
        System.out.println("Your total is "+ total + currency + " only.....");
        System.out.println("see you on your next visit !");





    }

}