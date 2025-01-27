import java.util.Scanner;
public class Sum {
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int num = input.nextInt();
    int digit = input.nextInt();
    int temp = num;
    int sum = 0;

    while(temp>0){
      int rem = temp % 10;
      if(rem == digit){
        temp /= 10;
        continue;
      }
      else{
        sum += rem;
      }
      temp /= 10;
    }
    System.out.println(sum);
  }
}
