import java.util.Scanner;
public class Switch{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // String fruit = input.next();
    // switch(fruit){
    //   case "Apple" -> System.out.println("Sweet Red fruit : Apple");
    //   case "Mango"-> System.out.println("King of fruits : mango");
    //   case "Orange" -> System.out.println("Round orange");
    //   case "Grapes" -> System.out.println("Small green fruit");
    //   default -> System.out.println("Enter a valid fruit");
    // }
    int day = input.nextInt();
    switch(day){
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thrusday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Saturday");
      case 7 -> System.out.println("Sunday");
    }
    input.close();
  }
}