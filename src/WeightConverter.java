import java.util.Scanner;
public class WeightConverter{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int choice;
        double weight;
        double lbs;
        double kgs;
        System.out.print("Enter the weight (KGS or LBS): ");
        weight = sc.nextDouble();
        System.out.println("1.Convert kgs to lbs!");
        System.out.println("2.Convert lbs to kgs!");
        System.out.print("Enter your choice:");
        choice  = sc.nextInt();
        if(choice == 2){
            kgs = weight*0.45359237;
            System.out.printf("The weight in kgs :%.4f",kgs);
        }else{
            lbs = weight*2.2;
            System.out.printf("The weight in lbs :%.4f",lbs);

        }
        sc.close();

    }
}