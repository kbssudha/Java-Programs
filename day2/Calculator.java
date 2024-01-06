package day2;   //package

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;//predefined class
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Calculator cal = new Calculator();
System.out.println("Enter first no: ");
    float x = scanner.nextFloat();
System.out.println("Enter second no: ");
    float y = scanner.nextFloat();
    System.out.println("Operations");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter your option: ");
int a= scanner.nextInt();
    if (a==1) {
        cal.add(x, y);
    } else if (a==2) {
        cal.subtract(x, y);
    } else if (a==3) {
        cal.multiplication(x,y);
    } else if (a==4) {
        cal.division(x,y);
            }
    }
/*public void add(int x,int y){
    int sum=x+y;
    System.out.println("Sum = "+ sum);
}*/
public void add(float x,float y){
        float sum=x+y;
        System.out.println("Sum = "+ sum);
    }
    public void subtract(float x,float y){
        float difference=x-y;
        System.out.println("Difference = "+ difference);
    }
    public void multiplication(float x,float y){
        float multi=x*y;
        System.out.println("Multiplication = "+ multi);
    }
    public void division(float x,float y){
        float quotient=x/y;
        float remainder=x%y;
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);
    }

}
