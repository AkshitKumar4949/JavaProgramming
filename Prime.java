import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int count = 0;
    int a = 2;
    while (a <= num) {
      if (a == 2) {
        System.out.println(a);
        count++;
      } else {
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
          if (a % i == 0) {
            isPrime = false;
            break;
          }
        }
        if(count==20){
          break;
        }
        if (isPrime == true) {
          System.out.println(a);
          count++;
        }
      }
      a++;
    }
  }
}
