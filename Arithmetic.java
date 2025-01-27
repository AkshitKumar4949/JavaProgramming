import java.util.Random;
import java.util.Scanner;
public class Arithmetic {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int num1 = random.nextInt();
    int num2 = random.nextInt();
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    input.close();
  }
}
