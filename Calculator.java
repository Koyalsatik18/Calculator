import java.util.*;
public class Calculator
{
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
     int result;
     char operator = sc.next().charAt(0);
          System.out.println("Enter a number");
    switch(operator)
    {
        case '+':
        result = num1+num2;
        System.out.println(result);
        break;
        case '-':
        result =num1-num2;
        System.out.println(result);
        break;
        case '*':
        result = num1*num2;
        System.out.println(result);
        break;
        case '/': 
        result = num1/num2;
        System.out.println(result);
        break;
        case '%':
        result = num1%num2;
        System.out.println(result);
        break;
        default:
        System.out.println("Invalid");
        break;
    }
}
}