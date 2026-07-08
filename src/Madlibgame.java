import java.util.Scanner;
public class Madlibgame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String adjactive1;
        String noun1;
        String adjactive2;
        String verb1;
        String adjactive3;
        System.out.print("Enter the adjactive1 (description) :");
        adjactive1 = sc.nextLine();
        System.out.print("Enter the noun1 (animal or person) :");
        noun1 = sc.nextLine();
        System.out.print("Enter the adjactive2 (description) :");
        adjactive2 = sc.nextLine();
        System.out.print("Enter the verb1 (action)- ending with ing :");
        verb1 = sc.nextLine();
        System.out.print("Enter the adjactive3 (description) :");
        adjactive3 = sc.nextLine();
        System.out.println("Today i went to a " + adjactive1 + "zoo.");
        System.out.println("In a exhibit, i saw a " +noun1 + ".");
        System.out.println(noun1+ " was " +adjactive2 + " and " +verb1 + "!");
        System.out.println("I was " +adjactive3 + "!");
        sc.close();
    }
}