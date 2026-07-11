import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         double temp;
         double newtemp;
         String unit;
        System.out.print("Enter the temperature (C or F): ");
        temp = sc.nextDouble();
        System.out.print("Enter the units (C or F): ");
        unit = sc.next().toUpperCase();
        newtemp = (unit.contains("C"))?(temp*9/5)+32:(temp-32)*5/9;
        System.out.printf("The Converted Temperature is: %.2f", newtemp);
        sc.close();



    }
}