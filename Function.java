import java.util.Scanner;
public class Function {
  public static void main(String[] Args){
    sum(4,8);
    sum();
  }
  static void sum(){
    int num1,num2;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number 1");
    num1 = input.nextInt();
    System.out.println("Enter the number 2");
    num2 = input.nextInt();
    input.close();
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1+num2));
  }
  static void sum(int a,int b){
    System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
  }
}