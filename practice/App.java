import java.util.*;
interface Calculator
{
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
}
interface Scientific
{
    double power(double a, double b);
}
class BasicCalculator implements Scientific,Calculator
{
    public double add(double a, double b)
    {
        return a+b;
    }
    public double sub(double a, double b)
    {
        return a-b;
    }
    public double mul(double a, double b)
    {
        return a*b;
    }
    public double div(double a, double b)
    {
        return a/b;
    }
    public double power(double a, double b){ return Math.pow(a,b);}
}
public class App {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        BasicCalculator app=new BasicCalculator();
        System.out.println("Enter first Value: ");
        double a=s.nextDouble();
        System.out.println("Enter Second Value: ");
        double b=s.nextDouble();
        System.out.println("Enter Any Symbol(+,-,*,/,^): ");
        char sys=s.next().charAt(0);
        double ans;
        switch(sys)
        {
            case '+':
                ans=app.add(a,b);
                System.out.println("Answer: "+ans);
                break;
            case '-':
                ans=app.sub(a,b);
                System.out.println("Answer: "+ans);
                break;
            case '*':
                ans=app.mul(a,b);
                System.out.println("Answer: "+ans);
                break;
            case '/':
                ans=app.div(a,b);
                System.out.println("Answer: "+ans);
                break;
            case '^':
                ans=app.power(a,b);
                System.out.println("Answer: "+ans);
                break;
        }
    }
}
