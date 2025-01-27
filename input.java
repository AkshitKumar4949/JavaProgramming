import java.util.Scanner;
public class input {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // System.out.print("Enter the number 1: ");
    // int Input1 = input.nextInt();
    // System.out.println("Enter the number 2: ");
    // int Input2 = input.nextInt();
    // int sum = Input1 + Input2;
    // System.out.print("The entered number is " + sum);

    // String Str = input.nextLine();
    // System.out.println(Str);

    int num = (int)(input.nextFloat());
    System.out.print(num);
    input.close();
  }
}
