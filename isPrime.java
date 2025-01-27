import java.util.Scanner;
public class isPrime {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    if(num<=1){
      System.out.println("Not prime");
    }
    int ct=0;
    for(int div=2;div<num;div++){
      if(num%div==0){
        ct++;
      }
    }
    if(ct==0){
      System.out.println("Prime");
    }
    else{
      System.out.println("Not prime");
    }
  }
}
