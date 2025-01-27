import java.util.Scanner;
public class allPrimeToN {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int a = 2;
    while(a<=num){
        if(a==2){
          System.out.println(a);
        }
        else{
          boolean isPrime = true;
          for(int i=2;i<a;i++){
            if(a%i==0){
              isPrime = false;
              break;
            }
          }
          if(isPrime==true){
            System.out.println(a);
          }
        }
      a++;
    }
  }
}
