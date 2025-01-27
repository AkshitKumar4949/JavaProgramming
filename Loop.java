import java.util.Scanner;
public class Loop {
  public static void main( String[] args){
    Scanner input = new Scanner(System.in);
    // int num = input.nextInt();
    // for(int i=1;i<=num;i++){
    //   System.out.println(i);
    // }

    // int a = input.nextInt();
    // int b = input.nextInt();
    // int c = input.nextInt();
    // if(a>b && a>c){
    //   System.out.print(a + " is the largest of three");
    // }
    // else if(b>c && b>a){
    //   System.out.print(b + " is greatest of three");
    // }
    // else{
    //   System.out.print(c + " is largest of three numbers");
    // }
    // int max = Math.max(c,Math.max(a, b));
    // System.out.println(max + " is largest");

    // Fibonacci series code

    // int a = 0;
    // int b = 1;
    // int current = 0;
    // int n = input.nextInt();
    // for(int i=0;i<n-1;i++){
    //   current = a + b;
    //   a = b;
    //   b = current;
    // }
    // System.out.println(current);

    // Counting the number of times a digit appears in a given number.

    // int number = input.nextInt();
    // int temp = number;
    // int thatNumber = input.nextInt();
    // int count = 0;
    // while(temp>0){
    //   int remainder = temp % 10;
    //   temp /= 10;
    //   if(remainder == thatNumber){
    //     count++;
    //   }
    // }
    // System.out.print(count + " is number of time " + thatNumber + " appeared in " + number);

    // Reversing a number

    // int number = input.nextInt();
    // int temp = number;
    // int reversedNumber = 0;
    // if(number > 0){
    //   while(temp>0){
    //     int remainder = temp %10;
    //     temp /= 10;
    //     reversedNumber =  reversedNumber*10 + remainder;
    //   }
    // }
    // System.out.println("Reversed number for " + number + " is " + reversedNumber);

    // Calculator program
    
    // int answer = 0;
    // while(true){
    //   System.out.print("Enter the operator:");
    //   char oper = input.next().trim().charAt(0);
    //   if(oper =='+' || oper == '-' || oper == '*' || oper =='/' || oper =='%'){
    //     System.out.println("Enter two numbers");
    //     int num1 = input.nextInt();
    //     int num2 = input.nextInt();
        
    //     if(oper =='+'){
    //       answer = num1 + num2;
    //     }
    //     if(oper =='-'){
    //       answer = num1 - num2;
    //     }
    //     if(oper =='*'){
    //       answer = num1 * num2;
    //     }
    //     if(oper =='/'){
    //       answer = num1 / num2;
    //     }
    //     if(oper =='%'){
    //       answer = num1 % num2;
    //     }
    //     System.out.println(num1 + " " + oper + " " + num2 + " = " + answer);
    //   }
    //   else if(oper=='x'||oper=='X'){
    //     break;
    //   }
    //   else{
    //     System.out.println("Operator not valid");
    //   }
    // }
    input.close();
  }
}

/* when a = 0, b = 1, for 1st iteration current = 1, a = 1, b = 1
 * when a=1,b=1,curren
*/