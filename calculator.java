import java.util.*;
public class calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the First Number=");
        double a=sc.nextDouble();

        System.out.print("Enter the Operator(+,-,*,/)=");
        char operator=sc.next().charAt(0);

        System.out.print("Enter the Second Number=");
        double b=sc.nextDouble();

        switch(operator){
            case '+':
                System.out.print("Result=" + (a+b));
                break;
            case '-':
                System.out.print("Result=" + (a-b));
                break;
            case '*':
                System.out.print("Result=" + (a*b));
                break;
            case '/':
                System.out.print("Result=" + (a/b));
                break;
        }
    }
}