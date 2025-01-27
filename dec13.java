import java.util.Scanner;
public class dec13 {
  static void rec(int n){
    if(n>1){
      rec(n-1);
    }
    System.out.println(n);
  }
  static int pow(int x, int y){
    if(y==0){
      return 1;
    }
    return x*pow(x,y-1);
  }
  static int factorial(int fct){
    if(fct==0){
      return 1;
    }
    return fct * factorial(fct-1);
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y= input.nextInt();

    input.close();
  }
}
