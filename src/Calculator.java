import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;
        System.out.print("Enter the value of num1: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the value of num2: ");
        num2 = sc.nextDouble();
        System.out.print("Enter the operator (+ , - , / , * , %) :");
        operator = sc.next().charAt(0);
        switch(operator){
            case '+'-> result = num1+num2;
            case '-'-> result = num1-num2;
            case '/'-> result = num1/num2;
            case '*'->{
                if(num2 == 0){
                    System.out.println("Can't divided by zero!");
                }else {
                    result = num1*num2;
                }
            }
            case '%'-> result = num1%num2;

        }
        System.out.printf("The result value is : %.2f",result);
        sc.close();

    }
}